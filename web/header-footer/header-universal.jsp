<%--
  Created by IntelliJ IDEA.
  User: Edilson A. Cuamba
  Date: 30-May-20
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<header id="menu">
    <div class="container-menu">
    <h1>
        <a href="/WEB-INF/jsp/feedbacks/options.jsp" id="logo">
            <img src="/lib/img/logo.png" alt="Logo da EAC Corporation" height="51">
        </a>
    </h1>

    <div>
        <nav>
            <ul>
                <li><a class="home" href="mvc?logica=OptionsLogic"></a></li>
                <li><a href="/mvc?logica=AdicionaLogic">Adicionar</a></li>
                <li id="listar"><p>Listar</p>
                    <ul id="listar-oculto">
                        <li><a href="/mvc?logica=ListaDisplayTagLogi">Listar com DisplayTag</a></li>
                        <li><a href="/mvc?logica=ListaScriptletLogic">Listar com Scriptlet</a></li>
                        <li><a href="/mvc?logica=ListaTagLibLogic">Listar com TagLib</a></li>
                        <li><a href="/mvc?logica=ListaContactosLogic">Listar com JSP e Servlet</a></li>
                    </ul>
                </li>
                <li><a class="remove" href="#"></a></li>
            </ul>
        </nav>
    </div>
    </div>
</header>

