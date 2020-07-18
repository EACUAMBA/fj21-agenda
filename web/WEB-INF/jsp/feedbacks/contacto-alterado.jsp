<%--
  Created by IntelliJ IDEA.
  User: Edilson A. Cuamba
  Date: 07/06/2020
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Contacto alterado</title>

    <link rel="stylesheet" href="/lib/css/menu.css">
    <link rel="stylesheet" href="/lib/css/adiciona-contacto.css">
    <link rel="stylesheet" href="/lib/css/footer-universal.css">
    <link rel="stylesheet" href="/lib/css/contacto-alterado.css">

</head>
<body>
<%@ include file="/header-footer/header-universal.jsp" %>


<div class="container">
    <h1>Contcato foi alterado com sucesso</h1>
    <h2>Os novos dados são:</h2>
    <div class="linha-dado">
        <p class="titulo">ID:</p>
        <p class="dado">${contacto.id}</p>
    </div>
    <div class="linha-dado">
        <p class="titulo">Nome:</p>
        <p class="dado">${contacto.nome}</p>
    </div>
    <div class="linha-dado">
        <p  class="titulo">Email:</p>
        <p  class="dado">${contacto.email}</p>
    </div>
    <div class="linha-dado">
        <p  class="titulo">Endereço:</p>
        <p  class="dado">${contacto.endereco}</p>
    </div>
    <div class="linha-dado">
        <p  class="titulo">Data de nascimento:</p>
        <p  class="dado">${contacto.dataNascimento}</p>
    </div>
    <div class="linha-dado">
        <a href="/mvc?logica=ListaContactosLogic">
        <p class="lista-c">Ir para lista completa</p>
        </a>
    </div>
</div>
</body>
</html>
