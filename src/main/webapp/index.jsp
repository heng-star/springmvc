

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="/jsp/show.jsp" %>--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>index</title>

    <script type="text/javascript" src="./lib/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="./js/dojsonlist.js"></script>
    <script src="./layui/layui.js"></script>
    <script type="text/javascript">

        $(function () {
            $("#bax").click(function () {
                    $.ajax({
                        url:"jsp/ajax.do",
                        data:{
                            name:"张三",
                            age:25
                       },
                type:"post",
                dataType:"json",
                success:function(resp) {
                    alert("resp:  " + resp.name + "...." + resp.age);
                    //alert("iibutton");
                }
            })

        })
     })
    </script>

    <script type="text/javascript">
        $(function(){
            $("#buttonAjax02").click(function(){
                $.ajax({
                    url:"./jsp/dojson.do",
                    success:function(data){
                        alert(data.name +"<<<<<" +data.age);
                    }
                })
            })
        })
    </script>

    <link rel="stylesheet" href="./layui/css/layui.css">


</head>

<body>

<div align="center">

<h2>Hello World!</h2>

<div>
    第一个js
    <a href="./jsp/some.do">some.do请求</a>

    <form>

        <button type="submit" name="day" value="5">buuuu </button>
        <input name="day" value="1">

    </form>

    <br>
    <br>
    <br>

    <form method="post" action="./jsp/ajax.do">
        <P>viod  ajax请求测试</P>
        <input type="text" name="name" value="cx">
        <input type="text" name="age" value="24">
        <button name="button" id="bax" > ajax提交</button>


    </form>

    <button name="ibutton" id="buttonAjax" > ajax提交</button>
    <br>
    <br>

    <button name="ibutton02" id="buttonAjax02" > ajax02提交</button>
    <br>

    <button name="ibutton03" id="buttonAjax03" > ajax03提交</button>
    <br>

    <button name="ibutton04" id="buttonAjax04" > ajax04提交</button>
    <br>

    <div class="layui-container">
        常规布局（以中型屏幕桌面为例）：
        <div class="layui-row">
            <div class="layui-col-md9">
                你的内容 9/12
            </div>
            <div class="layui-col-md3">
                你的内容 3/12
            </div>
        </div>

        <%--移动设备、平板、桌面端的不同表现：--%>
        <div class="layui-row">
            <div class="layui-col-xs6 layui-col-sm6 layui-col-md4">
                移动：6/12 | 平板：6/12 | 桌面：4/12
            </div>
            <div class="layui-col-xs6 layui-col-sm6 layui-col-md4">
                移动：6/12 | 平板：6/12 | 桌面：4/12
            </div>
            <div class="layui-col-xs4 layui-col-sm12 layui-col-md4">
                移动：4/12 | 平板：12/12 | 桌面：4/12
            </div>
            <div class="layui-col-xs4 layui-col-sm7 layui-col-md8">
                移动：4/12 | 平板：7/12 | 桌面：8/12
            </div>
            <div class="layui-col-xs4 layui-col-sm5 layui-col-md4">
                移动：4/12 | 平板：5/12 | 桌面：4/12
            </div>
        </div>
    </div>









    <h3>msg:  ${msg}</h3>

    <form action="./jsp/posttest.do" method="post">
        <button  >  posttest</button>
    </form>

    </br>
    <p>
        今天的日期是: <%= (new java.util.Date()).toLocaleString()%>
    </p>

</div>

    <%
        pageContext.setAttribute("key","1");
    %>


    <form action="show.jsp">
        First name: <input type="text" name="fname"><br>
        Last name: <input type="text" name="lname"><br>
        <input type="submit" value="提交">
    </form>

</div>

<script>
    layui.use(['layer', 'form'], function(){
        var layer = layui.layer
            ,form = layui.form;

        layer.msg('Hello World');
    });
</script>
</body>


</html>
