/**
 * Created by sifu on 2017/11/17.
 */
// $("tbody").append(getHtmlContext(0,1, '我是标题', '我是内容','https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1511163601&di=cbf3788b25f474579fbbba42cb969d51&src=http://img.xgo-img.com.cn/pics/1549/a1548895.jpg', '我是举报信息', '我是时间'));
 /*$("tbody").append(getHtmlContext(1, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
 $("tbody").append(getHtmlContext(2, '15170334491', 'sifu', '打飞机', '2017.11.12'));
*/
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


/*
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

$.ajax({
    type: "GET",
    url: "http://123.207.110.102:8080/background/get-all-report-server",
    dataType: "json",
    async: false,
    success: function (data) {
        //html数据节点的添加
        var len = data.data.length;
        var mydata = data.data;
        for (var i = 0; i < len; i++) {
            $("tbody").append(getHtmlContext(
                mydata[i].server.serverId,
                mydata[i].reportServer.reportStatus,
                mydata[i].server.serverTitle,
                mydata[i].server.serverDescription,
                mydata[i].server.serverImg,
                mydata[i].reportServer.serverMessage,
                formatDateTime(mydata[i].reportServer.createTime)
            ));
        }
        // $("tbody").append(getHtmlContext(data.data.list[0].needId, data.data.list[0].checkStatus, '15170334491', data.data.list[0].needTitle, data.data.list[0].needDescription, './img/hello.jpg', '2017.11.12'));
        // $("tbody").append(getHtmlContext(data.data.list[1].needId, data.data.list[1].checkStatus, '15170334491', data.data.list[1].needTitle, data.data.list[1].needDescription, './img/hello.jpg', '2017.11.12'));
        // $("tbody").append(getHtmlContext(2,data.data.list[1].checkStatus, '15170334491', data.data.list[1].needTitle, data.data.list[1].needDescription,'./img/hello.jpg', '2017.11.12'));

    },
    error: function () {
        alert("错误");
    }
});
