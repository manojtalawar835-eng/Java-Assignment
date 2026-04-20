<%
String name = (String) request.getAttribute("username");
String email = (String) request.getAttribute("email");
String desig = (String) request.getAttribute("designation");
%>

<html>
<body>

<h2>User Details</h2>

<p>Name: <%= name %></p>
<p>Email: <%= email %></p>
<p>Designation: <%= desig %></p>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>