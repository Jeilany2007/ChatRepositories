<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
        <%-- Affichage de la cha�ne "message" transmise par la servlet --%>
        <p class="info">${ message }</p>
        <%-- Puis affichage des donn�es enregistr�es dans le bean "connexion" transmis par la servlet --%>
        <p>${ cnx.username }</p>
    </body>
</html>