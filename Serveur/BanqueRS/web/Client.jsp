<%--
  Created by IntelliJ IDEA.
  User: m_che
  Date: 12/04/2018
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--  <%@page import="BanqueService"%>--%>
<%@ page import="ws.BanqueService" %>

<%
    double montant = 0;
    double resultat = 0;

    if (request.getParameter("montant") != null) {
        montant = Double.parseDouble(request.getParameter("montant"));
        BanqueService service = new BanqueService();
        resultat = service.conversion(montant);
    }
%>
<html>
<body>
<form action="Client.jsp">
    Montant en € :<input type="text" name="montant" value="<%=montant%>">
    <input type="submit" value="OK">
</form>
est égale à <%=resultat %> $
</body>
</html>
