
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Webshop registracija</title>
    </head>
    <body>
        <a href ="registracija.jsp">Registracija</a>
            <a href ="onama.jsp">O nama</a>
            <a href ="kontakt.jsp">Kontakt</a>
            <a href ="galerija.jsp">Galerija</a>
            <a href ="prikaz.jsp"> Prikaz modela</a>
        <form name ="LOGIN_forma" action = "prikaz.jsp" method ="post">
            Ime korisnika: <input type="text" name ="ime" size ="10"><br>
            Prezime korisnika: <input type="text" name ="prezime" size ="10"><br>
            Adresa korisnika: <input type="text" name ="adresa" size ="10"><br>
            Broj telefona korisnika: <input type="text" name ="broj" size ="10"><br>
            Email korisnika: <input type ="text" name ="email" size ="10"><br>
            
            <input type ="submit" name ="prosledi" value ="Prosledi">
            
            

        </form>
    </body>
</html>
