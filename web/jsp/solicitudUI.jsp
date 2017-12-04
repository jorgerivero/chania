<%-- 
    Document   : solicitudUI
    Created on : 27/11/2017, 11:39:39 PM
    Author     : Jorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/styles.css">
        <script type="text/javascript" src="js/validaciones.js"></script>
    </head>
    <body onload="">
    <center>
        Alumno: Jorge Rivero R.<br><br>
        <fieldset style="border:2px solid green;" class="stack1">
            <legend>Elige una opción</legend>
            <form name="solicitud_form" id="solicitud_form" action="../solicitud_serv" method="post" 
                  target="">
                <table>
                    <tr>
                        <td colspan="2">Solicitud</td>
                    </tr>
                    <tr>
                        <td class="column_izq">
                            Nombre:
                        </td>
                        <td class="column_der">
                            <input type="text" name="nombre" id="nombre" 
                                value="" onchange="">
                        </td>
                    </tr>
                    <tr>
                        <td class="column_izq">
                            Apellido Paterno:
                        </td>
                        <td class="column_der">
                            <input type="text" name="ape_pat" id="ape_pat" 
                                value="" onchange="">
                        </td>
                    </tr>
                    <tr>
                        <td class="column_izq">
                            Apellido Materno:
                        </td>
                        <td class="column_der">
                            <input type="text" name="ape_mat" id="ape_mat" 
                                value="" onchange="">
                        </td>
                    </tr>
                    <tr>
                        <td class="column_izq">
                            Email:
                        </td>
                        <td class="column_der">
                            <input type="text" name="email" id="email" 
                                value="" onchange="">
                        </td>
                    </tr>
                    <tr>
                        <td>
                    <input type="submit" value="Guardar" name="boton_aceptar" 
                       id="boton_aceptar"
                       onclick="">
                        </td>
                        <td>
                            <input type="reset" value="Nuevo" 
                                   name="boton_nuevo" id="boton_nuevo">
                        </td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </center>
    </body>
</html>
