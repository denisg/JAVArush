<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del javabean</title>
    </head>
    <body>
        <h1>jsp que lee los valores de javabean</h1>
        
        <jsp:useBean id="rectangulo" class="Beans.Rectangulo" scope="session" />
        <!--con esto busca la variable 'rectangulo', si existe en el scope lo recupera, si no, lo crea-->
        <br/><!-- comment -->
        Valor base:<jsp:getProperty name="rectangulo" property="base" />
        <br/>
        Valor altura:<jsp:getProperty name="rectangulo" property="altura" />
        <br>
        Valor area: <jsp:getProperty name="rectangulo" property="area" />
        <!--no existe mapeada el atributo area, pero se puede llamar igualmente al metodo getArea()
        -->
        <br>
        <br>
        <a href="index.jsp">Regreso inicio</a>
        
        
        
        
        
        
        
    </body>
</html>
