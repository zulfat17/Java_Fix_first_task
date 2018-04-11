<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Управление</title>
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
                    <img src="images/icon4.png"></img>
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
</body>
<div class="form-style-2">
    <div class="form-style-2-heading"> Форма для добавления товара</div>
    <form method="post" action="/adminka">
        <label for="company">Компания
            <input class="input-field" type="text" id="company" name="company">
        </label>
        <label for="model">Модель
            <input class="input-field" type="text" id="model" name="model">
        </label>
        <label for="max_speed">Макc. скорость
            <input class="input-field" type="number" id="max_speed" name="max_speed">
        </label>
        <label for="price">Стоимость
            <input class="input-field" type="number" id="price" name="price">
        </label>
        <input type="submit" value="Добавить товар">
    </form>
</div>
</html>
