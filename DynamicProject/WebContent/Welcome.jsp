<%@page
import="in.co.rays.model.UserModel" %>
<%@page
import="in.co.rays.bean.UserBean" %>
<%@page
import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Hello...!!!!</h1>
<%
String firstName = request.getParameter("firstName");
String lastName = request.getParameter("lastName");
String loginId =request.getParameter("loginId");
String password = request.getParameter("password");
String dob = request.getParameter("dob");
String address = request.getParameter("address");

SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
 UserBean bean = new UserBean();
 bean.setFirstname(firstName);
 bean.setLastname(lastName);
 bean.setLoginId(loginId);
 bean.setPassword(password);
 bean.setDob(sdf.parse(dob));
 bean.setAddress(address);
 
 UserModel model = new UserModel();
 model.add(bean);
 %>
<h1><%=firstName%></h1>
<h1><%=lastName%></h1>
<h1><%=loginId%></h1>
<h1><%=password%></h1>
<h1><%=dob %></h1>
<h1><%=address%></h1>


</body>
</html>