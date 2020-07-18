<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ page import="java.util.*" %>

<%--
  Created by IntelliJ IDEA.
  User: Edilson A. Cuamba
  Date: 31/05/2020
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="br.com.caelum.agenda.jdbc.dao.ContactoDao" %>
<% request.setAttribute("test", new ContactoDao().getLista()); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="/lib/css/menu.css">
    <link rel="stylesheet" href="/lib/css/footer-universal.css">
</head>
<body>
<%@ include file="/header-footer/header-universal.jsp" %>
<div class="container">
<display:table name="test" >
    <display:column property="id" title="ID"/>
    <display:column property="nome" title="Nome"/>
    <display:column property="email" title="Email"/>
    <display:column property="endereco" title="Endereco"/>
    <display:column property="dataNascimento" title="Data de Nascimento"/>
</display:table>
</div>

<C:import url="../../../header-footer/footer.jsp"></C:import>

</body>
</html>