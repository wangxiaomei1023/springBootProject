function CommonUtil() {
}

CommonUtil.prototype = {};

CommonUtil.loadHtml = function (divId, url) {
    $("#" + divId).load(url);
}

CommonUtil.navBarLoad = function (url) {
    CommonUtil.loadHtml("main-page", url)
}
