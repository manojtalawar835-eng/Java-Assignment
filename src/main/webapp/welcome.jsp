<%
    session.setMaxInactiveInterval(60);

    String name = request.getParameter("username");

    if (name != null && !name.trim().equals("")) {
        session.setAttribute("user", name);
    }

    String user = (String) session.getAttribute("user");
%>

<html>
<body>

<%
    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session expires in 1 minute</p>
<%
    } else {
%>
        <h3>Session Expired!</h3>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>