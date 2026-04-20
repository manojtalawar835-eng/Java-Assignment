<%@ page language="java" %>
<html>
<body>

<h2>Active Cookies</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie c : cookies) {
%>
            <p>
                Name: <%= c.getName() %> |
                Value: <%= c.getValue() %> |
                Max Age: <%= c.getMaxAge() %>
            </p>
<%
        }
    } else {
%>
        <p>No cookies found.</p>
<%
    }
%>

<br>
<a href="cookieForm.jsp">Back</a>

</body>
</html>