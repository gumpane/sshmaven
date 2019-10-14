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
  	<h3>部门添加</h3>
	<form action="save.action" method="post">
		<div class="form-group">
			<label>部门编号</label>
			<input name="dept.deptno" id="deptno" class="form-control">
		</div>
		<div class="form-group">
			<label>部门名称</label>
			<input name="dept.dname" id="dname" class="form-control">
		</div>
		<div class="form-group">
			<label>部门所在地</label>
			<input name="dept.loc" id="loc" class="form-control">
		</div>
		<button class="btn btn-primary">添加</button>
		<button class="btn btn-warning" type="reset">重置</button>
	</form>
   </div>
</body>
</html>