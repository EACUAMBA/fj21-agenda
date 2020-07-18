<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Edilson A. Cuamba
  Date: 30-May-20
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="br.com.caelum.agenda.jdbc.dao.ContactoDao"  %>
<%@ page import="br.com.caelum.agenda.jdbc.modelo.Contacto"  %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<% String css = "lib/css/index.css";%>
<% String title = "Listagem com scriptlet"; %>
<%@include file="../../../header-footer/header-adicionar.jsp" %>
<body>
<div class="container">
<table width="100%" border="1" style="width: 100%; background-color: #c5c5c5; border: #2b2b2b 1px solid;">
    <tr >
        <th>ID</th>
        <th>Nome</th>
        <th>Email</th>
        <th>Endereço</th>
        <th>Data de Nascimento</th>
        <th>Remover</th>
    </tr>

<%
    List<Contacto> contactos = new ContactoDao().getLista();
    for(Contacto contacto : contactos){
        %>
    <tr>
        <td><%=contacto.getId()%></td>
        <td><%=contacto.getNome()%></td>
        <td><%=contacto.getEmail()%></td>
        <td><%=contacto.getEndereco()%></td>
        <td><%=contacto.getDataNascimento().format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy"))%></td>
        <td><a href="/mvc?logica=RemoveContactoLogic&id=<%=contacto.getId()%>&nome=<%=contacto.getNome()%>">Remover</a></td>
    </tr>


<%
    }
%>
</table>
</div>
<c:import url="../../../header-footer/footer.jsp"></c:import>
</body>
</html>
