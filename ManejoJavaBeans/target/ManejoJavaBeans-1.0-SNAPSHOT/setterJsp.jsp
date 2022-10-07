<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica javabean rectangulo</title>
    </head>
    <body>
        <h1>jsp que modifica un javabean</h1>
        <jsp:useBean id="rectangulo" class="Beans.Rectangulo" scope="session"/>
            <!--se hace referencia a la clase beans.rectangulo
            
            'scope' permite definir el tiempo de existencia de datos
            en este caso los datos de la clase rectangulo. 
            Opciones: 'request' solo durante la peticion ; 'session' la info sigue existiendo mientras se realizan otras peticiones
            se elimina pasado 30 min o cierre de session o se detenga el servidor
            'aplication' dura lo que este arriba la aplicacion o se detenga la aplicacion-->
        Modificamos los atributos:
        <br>
        <br>
        <%
            int baseValor = 5;
            int alturaValor=10;
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" />
        <!--basicamente: se llama al metodo setBase() de la clase rectangulo con set y property con su valor correspondiente
        'name' hace referencia a la variable bean(linea 9)-->
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>"/>
        <!--analogo para la otra propiedad-->
        
    </body>
</html>
