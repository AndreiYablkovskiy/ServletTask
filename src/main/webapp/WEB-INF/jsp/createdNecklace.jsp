<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
    <body>
        <b> <h1> The necklace is created, composition : </h1> </b>
        <p> <i> One ${createdNecklace.gemList[0].stoneName} with ${createdNecklace.gemList[0].clarity} clarity </i> </p>
        <p> <i> One ${createdNecklace.gemList[1].stoneName} with ${createdNecklace.gemList[1].clarity} clarity </i> </p>
        <p> <i> One ${createdNecklace.gemList[2].stoneName} with ${createdNecklace.gemList[2].clarity} clarity </i> </p>
        >>> <a href="/description"><b> To see the full description </b></a>  <<<
    </body>
</html>