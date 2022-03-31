<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ page import="model.jewels.Necklace" %>
<%@ page import="service.NecklaceService" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <h1> Sorted: </h1>
        <% Necklace necklace = (Necklace) session.getAttribute("createdNecklace"); %>
        <% NecklaceService service = new NecklaceService(necklace); %>
        <% service.sortLowToHighPrice(); %>
        <%= necklace.getGemList() %>
        ${necklace.gemList}
        <c:forEach var="gem" items="${necklace.gemList}">
                <p> ${gem} </p>
            </c:forEach>
        </body>
</html>