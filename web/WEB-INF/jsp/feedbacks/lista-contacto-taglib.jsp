<%--
  Created by IntelliJ IDEA.
  User: Edilson A. Cuamba
  Date: 30-May-20
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <% String css = "lib/css/index.css";%>
    <% String title = "Listagem com TAGLIB"; %>
    <%@include file="../../../header-footer/header-adicionar.jsp" %>
<jsp:useBean id="ContactoDao" class="br.com.caelum.agenda.jdbc.dao.ContactoDao">

<div class="container">
    <table width="100%" border="1" style="width: 100%; background-color: #c5c5c5; border: #2b2b2b 1px solid;">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Endereço</th>
            <th>Data de Nascimento</th>
        </tr>
        <c:forEach var="contacto" items="${ContactoDao.lista}">
            <td>${contacto.id}</td>
            <td>${contacto.nome}</td>
            <c:choose>
                <c:when test="${not empty contacto.email}">
                    <td><a href="mailto: ${contacto.email}">${contacto.email}</a></td>
                </c:when>
                <c:otherwise>
                    <td>Email não informado!</td>
                </c:otherwise>
            </c:choose>
            <td>${contacto.endereco}</td>
            <td>${contacto.dataNascimento}</td>
            </tr>
        </c:forEach>
    </table>
</div>
    <c:import url="../../../header-footer/footer.jsp"></c:import>
    </body>
    </html>
</jsp:useBean>