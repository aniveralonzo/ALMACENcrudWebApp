<%-- 
    Document   : index
    Created on : 9/09/2020, 18:22:14
    Author     : 50232
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%--        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">--%>
        <title>AlmacenCrud</title>
    </head>

    <body>
            <a href="proveedor">Crear Proveedor</a>                
                    <table border="1">
                        <thead>
                            <tr>
                                <th>Cod_Proveedor</th>
                                <th>Nombre_Comercial</th>
                                <th> Contacto </th>
                                <th> Direccion </th>
                                <th> Email </th>
                                <th> Pais </th>
                                <th>** cambios **</th>
                            </tr>
                        </thead>
                        <tbody>
                         <c:forEach var="proveedor" items="${proveedorList}">
                            <tr>
                                <td>${proveedor.codigo}</td>
                                <td>${proveedor.nombreComercial}</td>
                                <td>${proveedor.contacto}</td>
                                <td>${proveedor.direccion}</td>
                                <td>${proveedor.email}</td>
                                <td>${proveedor.pais}</td>                                
                                <td>
                                    <a href="proveedor/codigo/${proveedor.codigo}">Editar</a>
                                    <a href="proveedor/eliminar/${proveedor.codigo}">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>    
                        </tbody>
                    </table>
    </body>

</html>