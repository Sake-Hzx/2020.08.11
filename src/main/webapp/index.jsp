<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/8
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <!-- 3个js  2个css -->
    <!-- jquery -->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <!-- easyui -->
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
    <!-- 语言包 -->
    <script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
    <!-- 主体样式 -->
    <link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
    <!-- 图标样式 -->
    <link rel="stylesheet" type="text/css" href="themes/icon.css">
</head>
<body>

<div id="cc" class="easyui-layout" data-options="fit:true" style="width:600px;height:400px;">
    <div data-options="region:'north',split:true" style="height:100px;">

        <h1>菜单管理系统</h1> admin 登录

    </div>

    <div data-options="region:'west',title:'菜单管理',split:true" style="width:150px;">

        <!-- 左边区域  放置  菜单-->
        <div id="menulist" class="easyui-accordion" data-options="fit:true">
            <div title="用户管理" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">
                <a href="userlist.jsp">用户列表</a><br>
                <a href="useradd.html">用户添加</a>
            </div>

        </div>

    </div>
    <div data-options="region:'center'" style="padding:5px;background:#eee;">
        <!--中间区域  显示选项卡 -->
        <div id="tt" class="easyui-tabs" data-options="fit:true" style="width:500px;height:250px;">
            <div title="首页" style="padding:20px;display:none;">
                欢迎使用本系统
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
        //选项卡选中事件
    $("#menulist a").click(function (e) {
        //组织超链接的默认行为
        e.preventDefault();
        //判断是否打开了
        var res = $("#tt").tabs('exists', $(this).text());
        if (res) {
            //打开  选中已打开
            $("#tt").tabs('select', $(this).text());
        } else {
            //未打开  添加选项卡
            var url = $(this).attr("href");
            $("#tt").tabs('add', {title: $(this).text(), closable: true, href: url});
        }
    });

</script>


</body>
</html>
