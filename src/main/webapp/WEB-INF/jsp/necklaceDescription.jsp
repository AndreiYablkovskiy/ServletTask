<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.jewels.Necklace" %>
<html>
    <body>
        <h1>The necklace consists of: </h1>
        <% Necklace necklace = (Necklace) session.getAttribute("createdNecklace"); %>
        <p><%= necklace %></p>
        <p>The necklace carat value is <%= necklace.getJewelCaratValue() %></p>
        <p>The necklace price is <%= necklace.getJewelPrice() %></p>
        <a href="http://localhost:8080/sort">Sort gems from low to high gems price</a>
    </body>
</html>