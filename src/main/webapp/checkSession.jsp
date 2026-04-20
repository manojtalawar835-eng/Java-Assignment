<%
    String user = (String) session.getAttribute("user");
%>

<html>
<body>

<%
    if (user != null) {
%>
        <h2>Hello <%= user %>! Session is Active</h2>
<%
    } else {
%>
        <h3>Session Expired!</h3>
        <a href="index.jsp">Restart</a>
<%
    }
%>

</body>
</html>