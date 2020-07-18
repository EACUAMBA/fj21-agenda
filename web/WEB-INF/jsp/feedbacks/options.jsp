<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Edilson A. Cuamba
  Date: 30-May-20
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>

<link rel="stylesheet" href="/lib/css/menu.css">
<link rel="stylesheet" href="/lib/css/footer-universal.css">
<link rel="stylesheet" href="/lib/css/index.css">
<title>SIG Agenda</title>
</head>
<%@ include file="/header-footer/header-universal.jsp" %>

<div class="container">
  <table width="100%" border="1" bgcolor="#7fffd4">
    <thead>
    <tr>
      <th>
        Nome
      </th>
      <th>
        Descrição
      </th>
      <th>
        Link
      </th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>
        Adicionar novo Contacto
      </td>
      <td>
        Sem descrição
      </td>
      <td class="action">
        <a href="/mvc?logica=AdicionaLogic">Clique aqui!</a>
      </td>
    </tr>
    <tr>
      <td>
        Lista
      </td>
      <td>
        Lista com DisplayTag
      </td>
      <td class="action">
        <a href="/mvc?logica=ListaDisplayTagLogic">Clique aqui!</a>
      </td>
    </tr>
    <tr>
      <td>
        Lista
      </td>
      <td>
        Lista com Scriptlet
      </td>
      <td class="action">
        <a href="/mvc?logica=ListaScriptletLogic">Clique aqui!</a>
      </td>
    </tr>
    <tr>
      <td>
        Lista
      </td>
      <td>
        Lista com TagLib
      </td>
      <td class="action">
        <a href="/mvc?logica=ListaTagLibLogic">Clique aqui!</a>
      </td>
    </tr>
    <tr>
      <td>
        Lista
      </td>
      <td>
        Lista com JSP e SERVLET
      </td>
      <td class="action">
        <a href="/mvc?logica=ListaContactosLogic">Clique aqui!</a>
      </td>
    </tr>
    </tbody>
  </table>
</div>
<c:import url="../../../header-footer/footer.jsp"></c:import>
  </body>
</html>
