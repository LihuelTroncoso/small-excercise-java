<%-- 
    Document   : muestraDatos
    Created on : 22 oct. 2021, 08:01:54
    Author     : E.T 36
--%>

<%@page import="models.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Alumno a1 = (Alumno) request.getAttribute("atribAlumn"); %>
        <h1>Tus datos:</h1>
        <p>Nombre: <%= a1.getNombre() %></p>
        <p>Apellido: <%= a1.getApellido() %></p>
        <p>Promedio: <%= a1.getPromedio() %></p>
    </body>
</html>
