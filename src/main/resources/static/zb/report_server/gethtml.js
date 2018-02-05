var myTitle;

var myContext1;

var myImg;

var myContext2;

var myTime;

var myId;


var check0 = '<td class="hidden-phone"><span class="label label-info" id="id';

var check1 = '<td class="hidden-phone"><span class="label label-success" id="id';

var check2 = '<td class="hidden-phone"><span class="label label-danger" id="id';

var appendTitle = '<tr class="odd gradeX"><td><input type="checkbox" class="checkboxes" value="1" /></td><td>';

var appendContext1 = `
        <td class="hidden-phone">
            <div class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <span class="username">服务内容</span>
                <b class="caret"></b>
            </a>
            <div class="dropdown-menu extended logout">

`;

var appendContext2 = `
    </div>
    </div>
    </td>
    <td class="hidden-phone">
        <div class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <span class="username">举报说明</span>
                <b class="caret"></b>
            </a>
            <div class="dropdown-menu extended logout">
`;


var appendTime = `
     </div>
        </div>
       </td><td class="center hidden-phone">
`;

var appendCheck = '</td>';

var checkString;

var lastString;

function checkappend(id) {
    return `
<a href="#" onclick="myChecked(` + id + `,1)" class="tooltip-test" data-toggle="tooltip" title="未 违 规">
    <button class="btn btn-success btn-xs">
        <i class="icon-ok" ></i>
    </button>
</a>

    <a href="#" onclick="myChecked(` + id + `,2)" class="tooltip-test" data-toggle="tooltip" title="违 规">
    <button class="btn btn-danger btn-xs">
        <i class="icon-remove"></i>
    </button>
</a>

<a href="#" onclick="myChecked(` + id + `,0)" class="tooltip-test" data-toggle="tooltip" title="待 处 理">
    <button class="btn btn-primary btn-xs">
        <i class="icon-pencil"></i>
    </button>
</a>

    `;
}


var resultNode;

/**
 *
 * @param keyId 需求id
 * @param checkStatus 举报的审核状态
 * @param title 需求的标题
 * @param context1 需求的内容
 * @param img 需求的图片
 * @param context2 举报说明
 * @param time 举报时间
 * @returns {string|*}
 */
function getHtmlContext(keyId, checkStatus, title, context1, img, context2, time) {
    myTitle = title;
    myContext1 = context1;
    myContext2 = context2;
    myTime = time;
    myId = keyId;
    myImg = getImg(img);
    lastString = checkappend(myId);

    //0:未审核
    if (checkStatus === 0) {
        checkString = check0 + keyId + '">待处理</span>';
        resultNode = appendTitle + myTitle + appendContext1 + '<p>' + myContext1 + '</p>' + myImg + appendContext2 + myContext2 + appendTime + myTime + appendCheck + checkString + lastString;
        return resultNode;
    }
    //1：通过
    else if (checkStatus === 1) {
        checkString = check1 + keyId + '">未违规</span>';
        resultNode = appendTitle + myTitle + appendContext1 + '<p>' + myContext1 + '</p>' + myImg + appendContext2 + myContext2 + appendTime + myTime + appendCheck + checkString + lastString;
        return resultNode;
    }
    //2:未通过
    else if (checkStatus === 2) {
        checkString = check2 + keyId + '">违规</span>';
        resultNode = appendTitle + myTitle + appendContext1 + '<p>' + myContext1 + '</p>' + myImg + appendContext2 + myContext2 + appendTime + myTime + appendCheck + checkString + lastString;
        return resultNode;
    }
}

// <img src="./img/hello.jpg" style="padding-left: 10%; width: 90%"/><p></p>

/**
 * 图片字符串拼接
 *
 * @param img 图片链接字符串
 * @returns {string} html字符串（图片显示）
 */
function getImg(img) {
    var imgStr1 = '<img src="';
    var imgStr2 = '" style="padding-left: 10%; width: 90%"/><p></p>';
    var imgStr = '';
    var result = '';
    if (img === null) {
        return '';
    } else {
        var image = img.split(',');
        for (var i = 0; i < image.length; i++) {
            imgStr = imgStr1 + image[i] + imgStr2;
            result += imgStr;
        }
        // console.log(result);
        return result;
    }
}


$(document).ready(function () {

});


/*

 $.ajax({
 type: "GET",
 url: "http://localhost:8080/user/refresh/",
 dataType: "json",
 success: function (data) {
 //html数据节点的添加
 },
 error: function () {
 alert("错误");
 }
 });
 */
/**
 * 审核
 *
 * @param myThisId 这个是服务id或者需求id
 * @param myThisCheckId 审核状态id 0为未审核，1为通过，2为不通过
 */
function myChecked(myThisId, myThisCheckId) {
    /*    if (myThisCheckId === 0) {
     $("#id" + myThisId).attr({
     "class": "label label-info",
     });
     $("#id" + myThisId).text("待审核");
     }
     //通过
     else if (myThisCheckId === 1) {
     $("#id" + myThisId).attr({
     "class": "label label-success",
     });
     $("#id" + myThisId).text("已通过");
     }
     //不通过
     else if (myThisCheckId === 2) {
     $("#id" + myThisId).attr({
     "class": "label label-danger",
     });
     $("#id" + myThisId).text("不通过");
     }*/

    $.ajax({
        type: "GET",
        data: {
            serverId: myThisId,
            status: myThisCheckId
        },
        url: "http://123.207.110.102:8080/background/dispose-report-server/",
        dataType: "json",
        success: function (data) {
            // TODO 修改id为("id"+myThisId)的内容
            //未审核
            if (myThisCheckId === 0) {
                $("#id" + myThisId).attr({
                    "class": "label label-info",
                });
                $("#id" + myThisId).text("待处理");
                toast("操作成功", 2000);
            }
            //通过
            else if (myThisCheckId === 1) {
                $("#id" + myThisId).attr({
                    "class": "label label-success",
                });
                $("#id" + myThisId).text("未违规");
                toast("操作成功", 2000);
            }
            //不通过
            else if (myThisCheckId === 2) {
                $("#id" + myThisId).attr({
                    "class": "label label-danger",
                });
                $("#id" + myThisId).text("违规");
                toast("操作成功", 2000);
            }
        },
        error: function () {
            alert("错误");
        }
    });
}


function toast(msg, duration) {
    duration = isNaN(duration) ? 3000 : duration;
    var m = document.createElement('div');
    m.innerHTML = msg;
    m.style.cssText = "width: 20%;min-width: 150px;opacity: 0.7;height: 30px;color: rgb(255, 255, 255);line-height: 30px;text-align: center;border-radius: 5px;position: fixed;top: 85%;left: 40%;z-index: 999999;background: rgb(0, 0, 0);font-size: 12px;";
    document.body.appendChild(m);
    setTimeout(function () {
        var d = 0.5;
        m.style.webkitTransition = '-webkit-transform ' + d + 's ease-in, opacity ' + d + 's ease-in';
        m.style.opacity = '0';
        setTimeout(function () {
            document.body.removeChild(m)
        }, d * 1000);
    }, duration);
}