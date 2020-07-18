package br.com.caelum.mvc.logica;

import br.com.caelum.agenda.jdbc.dao.ContactoDao;
import br.com.caelum.agenda.jdbc.modelo.Contacto;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.Connection;

public class AlteraContactoLogic implements Logica {
    @Override
    public String executa(ServletRequest request, ServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));

        Contacto contacto = new Contacto();
        for (Contacto contacto1: new ContactoDao((Connection)request.getAttribute("connection")).getLista()){
            if(id == contacto1.getId())
                contacto = contacto1;
        }
        request.setAttribute("contacto", contacto);

        return "altera-contacto.jsp";
    }
}
