

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dobro dosli!</h1>
        <%
            out.println("korisnicko ime je: " + request.getParameter("ime"));
        %><br>
        <%
            out.println("lozinka je:" + request.getParameter("prezime"));
        %><br>
        <%
            out.println("Ime korisnika je: " + request.getParameter("adresa"));
        %><br>
        <%
            out.println("Prezime korisnika je: " + request.getParameter("broj"));
        %><br>
        <%
            out.println("Godine korisnika su: " + request.getParameter("email"));


        %>
    </body>
</html>
