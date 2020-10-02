
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <a href ="registracija.jsp">Registracija</a>
            <a href ="onama.jsp">O nama</a>
            <a href ="kontakt.jsp">Kontakt</a>
            <a href ="galerija.jsp">Galerija</a>
            <a href ="prikaz.jsp"> Prikaz modela</a>

            <p>Kako je lako razumeti .JSP strane....</p>

            <%!
                public String hello() {
                    String msg = "Hello world!";
                    return msg;
                }
            %>
            Message from <br>Scriplet</br>:<% out.println(hello());%><b>Message from <br>Expression </b>:<%=hello()%>
            <br>
            <%
                String title = "Link e-learning";
                String address = "http://www.link-elearning.com";
                out.println("<a href='" + address + "'>" + title + "</a>");
            %>
            <br>
            <table border ="1">
            <%
                    for (int i = 1; i < 11; i++) {
                        out.print("<tr>");
                        for (int j = 1; j < 11; j++) {
                            out.print("<td>" + i * j + "</td>");
                        }
                       out.print("</td>");
                }
            %>
            </table>
        </form>
    </body>
</html>
