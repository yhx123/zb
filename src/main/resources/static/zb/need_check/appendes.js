/**
 * Created by sifu on 2017/11/17.
 */
/*$("tbody").append(getHtmlContext(0, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(1, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));*/

/* 时间格式化 start*/
function add0(m) {
    return m < 10 ? '0' + m : m
}
function formatDateTime(timestamp) {
    //timestamp是整数，否则要parseInt转换,不会出现少个0的情况

    var time = new Date(timestamp);
    var year = time.getFullYear();
    var month = time.getMonth() + 1;
    var date = time.getDate();
    var hours = time.getHours();
    var minutes = time.getMinutes();
    var seconds = time.getSeconds();
    return year + '-' + add0(month) + '-' + add0(date) + ' ' + add0(hours) + ':' + add0(minutes) + ':' + add0(seconds);
}
/*时间格式化end*/


/**
 * 添加html数据元素
 */
$.ajax({
    type: "GET",
    url: "http://123.207.110.102:8080/background/get-all-need-list",
    dataType: "json",
    async: false,
    success: function (data) {
        //html数据节点的添加
        var len = data.data.length;
        var mydata = data.data;
        for (var i = 0; i < len; i++) {
            $("tbody").append(getHtmlContext(
                mydata[i].need.needId,     //需求id
                mydata[i].need.checkStatus, //审核状态
                mydata[i].user.phoneNumber,             //电话号码
                mydata[i].need.needTitle, // 需求标题
                mydata[i].need.needDescription, //需求详情
                mydata[i].need.needImg,     //需求图片
                formatDateTime(mydata[i].need.createTime))); //发布时间
        }
        // $("tbody").append(getHtmlContext(data.data.list[0].needId, data.data.list[0].checkStatus, '15170334491', data.data.list[0].needTitle, data.data.list[0].needDescription, './img/hello.jpg', '2017.11.12'));
        // $("tbody").append(getHtmlContext(data.data.list[1].needId, data.data.list[1].checkStatus, '15170334491', data.data.list[1].needTitle, data.data.list[1].needDescription, './img/hello.jpg', '2017.11.12'));
        // $("tbody").append(getHtmlContext(2,data.data.list[1].checkStatus, '15170334491', data.data.list[1].needTitle, data.data.list[1].needDescription,'./img/hello.jpg', '2017.11.12'));

    },
    error: function () {
        alert("错误");
    }
});
