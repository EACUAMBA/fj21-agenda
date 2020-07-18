package br.com.caelum.mvc.logica;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ListaDisplayTagLogic implements Logica{
    @Override
    public String executa(ServletRequest request, ServletResponse response) throws Exception {
        return "lista-contacto-displaytag.jsp";
    }
}
