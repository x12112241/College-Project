
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    // Does the session indicate this user already logged in?
    Object done = session.getAttribute("logon.isDone");  // marker object
    if (done == null) {
      // No logon.isDone means she hasn't logged in.
      // Save the request URL as the true target and redirect to the login page.
      session.setAttribute("login.target", request.getRequestURI().toString());
      response.sendRedirect(request.getContextPath() + "/login.html");
      return;
    }

%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Developer Login</title>
    </head>
    <body>
        <p align="right"><%= done%> (<a href="Logout">logout</a>)</p>
        <h1>Welcome</h1>
        <p>This is a protected JSP page.</p>
        <p>You can also see the <a href="ProtectedServlet">protected servlet</a>.</p>
        <p align="right"><a href="<%= request.getContextPath() + "/"%>">home</p>
    </body>
</html>
