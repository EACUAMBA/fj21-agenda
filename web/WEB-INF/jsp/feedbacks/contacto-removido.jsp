<%--
  Created by IntelliJ IDEA.
  User: Edilson A. Cuamba
  Date: 05/06/2020
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="pt-pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Contacto Removido</title>
    <style>
        .container{
            background-color: aquamarine;
            font-family: "Devil Breeze";
            width: 966px;
            margin: 0px auto;
        }
    </style>
    <link rel="stylesheet" href="/lib/css/menu.css">
    <link rel="stylesheet" href="/lib/css/footer-universal.css">
</head>
<%@ include file="/header-footer/header-universal.jsp" %>
<body>
<div class="container">
    <header style="padding: 20px; background-color: #28ff8e; text-align: center">
        <h1>Contacto Removido!</h1>
    </header>
    <section style="text-align: center; font-family: 'LEMON MILK'">
        <h1>${param.nome} foi removido com sucesso!</h1>
    </section>
</div>
<%@include file="/header-footer/footer.jsp"%>
</body>
</html>
