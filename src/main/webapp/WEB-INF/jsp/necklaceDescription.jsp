<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <h1>The necklace consists of: </h1>
        <c:forEach var="gem" items="${createdNecklace.gemList}">
            <p> ${gem} </p>
        </c:forEach>
        <p><h3> The necklace carat value is ${createdNecklace.jewelCaratValue} </h3></p>
        <p><h3> The necklace price is ${createdNecklace.jewelPrice} </h3></p>
        <a href="/sort"><b> >>>Sort gems from low to high gems price <<< </b></a>
    </body>
</html>