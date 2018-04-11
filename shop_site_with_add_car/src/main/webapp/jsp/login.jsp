
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                        <%--<ul class="sub-icon1 list">--%>
                            <%--<li><h3> Ваша корзина пуста</h3><a href=""></a></li>--%>
                            <%--<li><p>Если хотите добавить новый товар, <a href="contact.html">Войдите</a> </p></li>--%>
                        <%--</ul>--%>
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
<div class="form-style-2">
    <div class="form-style-2-heading">
        Пожалуйста войдите в свой аккаунт!
    </div>
    <form method="post" action="/login">
        <label for="name">Логин
            <input class="input-field" type="text" id="name" name="name">
        </label>
        <label for="password">Пароль
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <input type="submit" value="Sign Up">
    </form>
</div>
</div>
</body>
</html>
