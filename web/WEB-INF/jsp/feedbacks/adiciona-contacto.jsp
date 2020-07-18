<%@ taglib prefix="data" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <link rel="stylesheet" href="/lib/css/menu.css">
    <link rel="stylesheet" href="/lib/css/adiciona-contacto.css">
    <link rel="stylesheet" href="/lib/css/footer-universal.css">

</head>
<body>
<%@ include file="/header-footer/header-universal.jsp" %>


<div class="container">
    <div>
        <h1>Adicione o seu contacto!</h1>
    </div>
    <form action="/mvc?logica=AdicionaActualizaLogic" method="POST">
        <fieldset>
            <h2>Preencha o formulario abaixo:</h2>
        <div class="label-input">

            <label for="nome">ID: </label>
            <input type="number" id="id" name="id">

            <label for="nome">Nome: </label>
            <input type="text" id="nome" name="nome">

            <label for="email">Email: </label>
            <input type="email" id="email" name="email">

            <label for="endereco">Endereço: </label>
            <input type="text" id="endereco" name="endereco" autocomplete="false">

            <label for="dataNascimento">Data de nascimento: </label>
            <data:campoData id="dataNascimento"  />
        </div>
        <div class="button">
            <input type="submit" name="enviar" value="Enviar">
        </div>
        </fieldset>
    </form>
</div>
<c:import url="../../../header-footer/footer.jsp"></c:import>
</body>
</html>