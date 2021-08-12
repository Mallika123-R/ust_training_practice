<%@ page import="web_app.dao.Person" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List</title>
</head>
<body>
<h3>Hi</h3>
<h1>${message}></h1>
<%
    List<Person> list= (List<Person>) request.getAttribute("x");
    for ( Person p : list  ) {
        out.print(p.getEmail());
        out.print(p.getName());
        out.print(p.getPhone());
        out.println("\n");
    }
%>

</body>
</html>
