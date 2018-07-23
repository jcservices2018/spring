<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form name="frm" action="/spring/byyy" method="post">
    	<input type="text" name="name"/>
    	
    	<input type="text" name="byte1"/>
    	<input type="text" name="short1"/>
    	<input type="text" name="int1"/>
    	<input type="text" name="long1"/>
    	
    	<input type="text" name="float1"/>
    	<input type="text" name="double1"/>
    	
    	<input type="text" name="char1"/>
    	<input type="text" name="boolean1"/>
    	
    	<input type="text" name="byte2"/>
    	<input type="text" name="short2"/>
    	<input type="text" name="int2"/>
    	<input type="text" name="long2"/>
    	
    	<input type="text" name="float2"/>
    	<input type="text" name="double2"/>
    	
    	<input type="text" name="char2"/>
    	<input type="text" name="boolean2"/>
    	
    	<input type="button" name="" value="提交" onclick="frm.submit()">
    </form>
  </body>
</html>
