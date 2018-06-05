

<script>
    if (isMobile())
        window.location.href = "https://mz.yonyoucloud.com/account/invite/mobileSucc";

    function isMobile() {
        var flag = false;
        var agent = navigator.userAgent.toLowerCase();
        var keywords = ["android", "iphone", "ipod", "ipad", "windows phone", "mqqbrowser"];

        //排除 Windows 桌面系统
        if (!(agent.indexOf("windows nt") > -1) || (agent.indexOf("windows nt") > -1 && agent.indexOf("compatible; msie 9.0;") > -1)) {
        //排除苹果桌面系统
            if (!(agent.indexOf("windows nt") > -1) && !agent.indexOf("macintosh") > -1) {
                for (var item in keywords) {
                    if (agent.indexOf(keywords[item]) > -1) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        return flag;
    }

</script>