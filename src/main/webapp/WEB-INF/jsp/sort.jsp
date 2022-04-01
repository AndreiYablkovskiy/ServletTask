<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <h1> Sorted gem price : </h1>
         <c:forEach var="gem" items="${sortedNecklace.gemList}">
            <p> ${gem.stoneName} price is  ${gem.gemPrice}$ </p>
         </c:forEach>
        </body>
</html>