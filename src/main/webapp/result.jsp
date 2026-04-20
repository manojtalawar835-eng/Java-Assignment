<%
String roll = (String) request.getAttribute("roll");
String name = (String) request.getAttribute("name");
double avg = (double) request.getAttribute("avg");
String result = (String) request.getAttribute("result");
%>

<html>
<body>

<h2>Student Result</h2>

<p>Roll No: <%= roll %></p>
<p>Name: <%= name %></p>
<p>Average: <%= avg %></p>
<p>Result: <%= result %></p>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>