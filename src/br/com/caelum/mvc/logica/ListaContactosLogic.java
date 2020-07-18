package br.com.caelum.mvc.logica;

import br.com.caelum.agenda.jdbc.modelo.Contacto;
import br.com.caelum.agenda.jdbc.dao.ContactoDao;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.Connection;
import java.util.List;

public class ListaContactosLogic implements Logica {
    @Override
    public String executa(ServletRequest request, ServletResponse response) throws Exception {
        List<Contacto> contactos = new ContactoDao((Connection)request.getAttribute("connection")).getLista();

        request.setAttribute("contactos",contactos);
        return "lista-contactos.jsp";
    }
}
