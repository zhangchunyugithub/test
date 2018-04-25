<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="full-screen" content="true">
    <meta name="x5-fullscreen" content="true">
    <meta name="viewport" content="width=375, user-scalable=no, minimal-ui">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black" />
    <title>通过链接接到申请</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            -moz-box-sizing:border-box; /* Firefox */
            -webkit-box-sizing:border-box; /* Safari */
        }

        html,
        body {
            width: 100%;
            height: 100%;
            position: relative;
            background-color: rgba(230, 233, 233, 1);
        }
        .um-win {
            position: absolute;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            display: -webkit-box;
            display: -moz-box;
            display: -webkit-flex;
            display: flex;
            -webkit-box-orient: vertical;
            box-orient: vertical;
            -webkit-flex-direction: column;
            flex-direction: column;
        }
        .um-css3-center {
            position: absolute;
            top: 50%;
            left: 50%;
            -webkit-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
        }
        .um-box{
            width:100%;
            max-width: 660px;
            background:rgba(255,255,255,1);
            border-radius: 3px ;
            text-align: center;
        }
        .header{
            margin: 47px 40px 0 ;
            position: relative;
            height: 42px;
        }
        .title{
            position: absolute;
            left: 50%;
            margin-left: -158px;
            width: 316px;
            background: #ffffff;
            font-size:32px;
            font-family:MicrosoftYaHei-Bold;
            color:rgba(71,77,84,1);
            line-height:42px;
            text-align: center;
            z-index: 2;
        }
        .line{
            position: absolute;
            z-index: 1;
            top: 50%;
            left: 0;
            width: 100%;
            height: 1px;
            background: rgba(13, 20, 36, 0.1)
        }
        .content{
            width: 50%;
            margin: 0 auto;
            text-align: left;
        }
        .name{
            font-size:17px;
            font-family:MicrosoftYaHei;
            color:rgba(71,77,84,1);
            line-height:32px;
            margin-top: 37px;
            margin-bottom: 22px;
            font-weight: 500;
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
        }
        .request{
            font-size:17px;
            font-family:MicrosoftYaHei;
            color:rgba(99,115,129,1);
            line-height:20px;
        }
        .team{
            font-size:27px;
            font-family:MicrosoftYaHei-Bold;
            color:rgba(71,77,84,1);
            line-height:36px;
            margin-top: 25px;
        }
        .button{
            margin-top: 88px;
            text-align: center;
        }
        .um-btn {
            outline: none;
            border: none;
            width:180px;
            height:46px;
            background:rgba(225,76,70,1);
            border-radius: 2px ;
            line-height: 46px;
            color: #ffffff;
            font-size: 16px;
        }
        .footer{
            margin-top: 110px;
            border-top: 1px solid rgba(13, 20, 36, 0.1);
            padding-top: 13px;
            padding-bottom: 22px;
        }
        .footer p{
            font-size:14px;
            font-family:MicrosoftYaHei;
            color:rgba(0,122,206,1);
            line-height:19px;
        }
        .footer span{
            font-size:12px;
            font-family:MicrosoftYaHei;
            color:rgba(74,81,93,1);
            line-height:16px;
        }
    </style>
</head>

<body>
<div class="um-win">
    <div class="um-css3-center um-box">
        <div class="header">
            <p class="title">团队邀请</p>
            <div class="line"></div>
        </div>
        <div class="content">
            <h4 class="name">HI , ${userName}</h4>
            <p class="request">邀请你加入团队:</p>
        </div>
        <h3 class="team">${tenantName}</h3>
        <form action="${joinTeam}" method="get">
            <div class="button">
                <button type="submit" class="um-btn">加入团队</button>
            </div>
        </form>
        <div class="footer">
            <p>diwork 官网</p>
            <span>建议在电脑端打开此页面</span>
        </div>
    </div>
</div>
</body>

</html>