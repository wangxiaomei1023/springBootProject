package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.service.Impl.RequestManagerImpl;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ：wangxiaomei17
 * @date ：Created in 2021-03-21 15:11
 * @description：处理请求，返回请求结果
 */

@Service
public class RequestManager implements RequestManagerImpl {

    public String getHttpRequestResult(String request){
        String response=null;
        JSONObject requestParams=JSONObject.parseObject(request);
        String requestType=requestParams.getString("requestType");
        String url=requestParams.getString("url");
        String param=requestParams.getString("param");
        try {
            if(requestType.equals("GET")){
                response=sendGet(url,param);
            }else {

            }
        }catch (Exception e){
            System.out.println(e);
        }
        return response;

    }

//发送get请求
    public String sendGet(String url,String params) throws Exception{
        String result=null;
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(url+"?"+params);

        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;
        try {
            HttpGet httpGet = new HttpGet(stringBuilder.toString());
            client = HttpClients.createDefault();
            response = client.execute(httpGet);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity);
            System.out.println(result);
            return result;
        } finally {
            if (response != null) {
                response.close();
            }
            if (client != null) {
                client.close();
            }
        }
    }
}
