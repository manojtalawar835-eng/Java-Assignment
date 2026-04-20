<%@ page language="java" %>
<html>
<head>
    <title>Cookie Form</title>
</head>
<body>

<h2>Add Cookie</h2>

<form action="addCookie.jsp" method="post">
    Name: <input type="text" name="cname" required><br><br>
    Domain: <input type="text" name="domain"><br><br>
    Max Age (seconds): <input type="number" name="age" required><br><br>

    <input type="submit" value="Add Cookie">
</form>

<br>
<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>