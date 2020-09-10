<%-- 
    Document   : crear
    Created on : 9/09/2020, 18:24:34
    Author     : 50232
--%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <title>Crear Proveedor</title>
    </head>
    <body>
        <h1>Crear Proveedor</h1>

        <span>${mensaje}</span>


        <form:form method="post" 
                   action="proveedor/crear" 
                   modelAttribute="proveedor">

            <form:label path="codigo">Codigo:</form:label> 
            <form:input path="codigo"  class="form-control"/>
            <br/>

            <form:label path="nombreComercial">Nombre Comercial:</form:label> 
            <form:input path="nombreComercial" class="form-control"/>
            <br/>

            <form:label path="contacto">Contacto</form:label> 
            <form:textarea path="contacto" class="form-control"/>
            <br/>


            <form:label path="direccion">Direccion</form:label> 
            <form:input path="direccion" class="form-control"/>
            <br/>

            <form:label path="email">Email:</form:label> 
            <form:input path="email" class="form-control"/>
            <br/>

            <form:label path="pais">Pais</form:label> 
            <form:textarea path="pais" class="form-control"/>
            <br/>


            <form:button class="">Enviar</form:button>
        </form:form>
    </body>
</html>

