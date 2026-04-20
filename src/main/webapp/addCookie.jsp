<%@ page language="java" %>
<%
    String cname = request.getParameter("cname");
    String domain = request.getParameter("domain");
    String ageStr = request.getParameter("age");

    int age = 0;
    if (ageStr != null && !ageStr.trim().equals("")) {
        age = Integer.parseInt(ageStr);
    }

    Cookie cookie = new Cookie(cname, "Value_" + cname);

    if (domain != null && !domain.trim().equals("")) {
        cookie.setDomain(domain);
    }

    cookie.setMaxAge(age);

    response.addCookie(cookie);
%>

<html>
<body>

<h2>Cookie Added Successfully!</h2>

<p>Name: <%= cname %></p>
<p>Domain: <%= domain %></p>
<p>Max Age: <%= age %> seconds</p>

<br>
<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>