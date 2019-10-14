<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
<%@ include file="nav.jsp" %>
  <div class="col-md-8">
	<table class="table table-bordered table-striped">
		<caption><h3>部门管理</h3></caption>
		<tr>
			<th>序号</th>
			<th>名称</th>
			<th>所在地</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
		<s:iterator value="depts" var="d" status="i">
			<tr>
				<th><s:property value="#i.count" /></th>
				<th><s:property value="#d.dname" /></th>
				<th><s:property value="#d.loc" /></th>
				<th><button class="editBtn btn btn-info" value="<s:property value="#d.deptno" />">编辑</button></th>
				<th><button class="delBtn btn btn-danger" value="<s:property value="#d.deptno" />">删除</button></th>
			</tr>
		</s:iterator>
	</table>
	<a href="deptAdd.jsp" class="btn btn-primary">添加部门</a>
   </div>
</body>
</html>
<script>
	$(document).ready(function(){
		$(".delBtn").click(function(){
			var sel = window.confirm("是否删除该部门?"+$(this).val());
			if(sel){
				location.href="del.action?dept.deptno="+$(this).val();
			}
		});
		$(".editBtn").click(function(){
			location.href="getDept.action?dept.deptno="+$(this).val();
		});
	});
</script>