<%--
  Created by IntelliJ IDEA.
  User: Edilson A. Cuamba
  Date: 05/06/2020
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="pt-pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Lista dos contactos JSP e Servlet</title>

    <link rel="stylesheet" href="/lib/css/menu.css">
    <link rel="stylesheet" href="/lib/css/footer-universal.css">
    <link rel="stylesheet" href="/lib/css/tabela.css">
</head>
<%@ include file="/header-footer/header-universal.jsp" %>
<div class="container-menu">
    <table >
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Endereço</th>
            <th>Data de Nascimento</th>
            <th>Acções</th>
        </tr>
        </thead>
        <c:forEach items="${contactos}" var="contacto">
            <tbody>
            <tr>
                <td>${contacto.id}</td>
                <td>${contacto.nome}</td>
                <td>${contacto.email}</td>
                <td>${contacto.endereco}</td>
                <td>${contacto.dataNascimento}</td>
                <td><a class="apagar" href="/mvc?logica=RemoveContactoLogic&id=${contacto.id}&nome=${contacto.nome}">Apagar</a> | <a class="editar" href="/mvc?logica=AlteraContactoLogic&id=${contacto.id}">Editar</a> </td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</div>
<c:import url="/header-footer/footer.jsp"></c:import>
</body>
>
</html>
