<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/8
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

id：<input type="text" name="id" id="id">
内容：<input type="text" name="text" id="text">
<a id="btnsearchuser" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
<br>

<div id="tbuser">
<a id="btnadduser" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
<a id="btnedituser" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">编辑</a>
<a id="btndeluser" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">删除</a>
</div>

<table id="dgvuser"></table>

<script type="text/javascript">

    //页面加载完成  初始化表格数据
    var param ={
        url:'querymenubycond2.action',
        columns:[[
            {field:'id',title:'编号',width:100},
            {field:'text',title:'text',width:100},
            {field:'url',title:'路径',width:100,align:'right'},
            {field:'image',title:'图片',width:100,align:'right'},
            {field:'state',title:'state',width:100,align:'right'},
            {field:'parentid',title:'parentid',width:100,align:'right'}
        ]],
        fitColumns:true,
        toolbar:'#tbuser',
        striped:true,   //是否显示斑马线效果
        pagination:true,  //则在DataGrid控件底部显示分页工具栏。
        rownumbers:true,   //如果为true，则显示一个行号列。
        singleSelect:true,  //如果为true，则只允许选择一行。
        pageSize:5,   //在设置分页属性的时候初始化页面大小
        pageList:[5,10,15,20,25]   //初始化页面大小选择列表。
    };
    $("#dgvuser").datagrid(param);

    //条件查询
    $("#btnsearchuser").click(function () {
        //调用datagrid load方法 传递要查询的数据给后端
        //刷新绑定地址  额外传递参数
        $("#dgvuser").datagrid('load',{name:$("#uname").val()});
    });

</script>

</body>
</html>
