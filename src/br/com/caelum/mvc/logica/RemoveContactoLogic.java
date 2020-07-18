package br.com.caelum.mvc.logica;


import br.com.caelum.agenda.jdbc.dao.ContactoDao;
import br.com.caelum.agenda.jdbc.modelo.Contacto;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.Connection;

public class RemoveContactoLogic implements Logica {

    @Override
    public String executa(ServletRequest request, ServletResponse response) throws Exception {
        Contacto contacto = new Contacto();
        contacto.setId(Integer.parseInt(request.getParameter("id")));
        new ContactoDao((Connection)request.getAttribute("connection")).apagar(contacto);
        System.out.println("Removendo....");
        return "contacto-removido.jsp";
    }
}
