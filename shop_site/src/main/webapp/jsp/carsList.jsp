<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page import="ru.yakupov.models.Car" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Лучший онлайн магазин в мире</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<div class="header_bg">
    <div class="wrap">
        <div class="header">
            <div class="logo">
                <a href="index.html"><img src="images/logo.png" alt=""/> </a>
            </div>
            <div class="h_icon">
                <ul class="icon1 sub-icon1">
                    <li><a class="active-icon c1" href="#"><i>$0</i></a>
                        <ul class="sub-icon1 list">
                            <li><h3> Ваша корзина пуста</h3><a href=""></a></li>
                            <li><p>Если хотите добавить новый товар, <a href="login">Войдите</a> </p></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <div class="h_search">
                <form>
                    <input type="text" value="">
                    <input type="submit" value="">
                </form>
            </div>
            <div class="clear"></div>
        </div>
    </div>
</div>
<table>
    <tr>
        <th>|Company / Consern |</th>
        <th> Model / Specification |</th>
        <th> Max Speed |</th>
        <th> Price |</th>
    </tr>
<c:forEach items="${carsFromSalon}" var="car">
    <tr>
        <td>${car.getCompany()}</td>
        <td>${car.getModel()}</td>
        <td>${car.getMaxSpeed()}</td>
        <td>${car.getPrice()}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
