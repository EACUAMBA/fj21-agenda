package br.com.caelum.mvc.logica;

import br.com.caelum.agenda.jdbc.dao.ContactoDao;
import br.com.caelum.agenda.jdbc.modelo.Contacto;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlteraContactoLogicSave implements Logica {
    @Override
    public String executa(ServletRequest request, ServletResponse response) throws Exception {
        ContactoDao contactoDao = new ContactoDao((Connection)request.getAttribute("connection"));
        Contacto contacto = new Contacto();
        contacto.setId(Integer.parseInt(request.getParameter("id")));
        contacto.setNome(request.getParameter("nome"));
        contacto.setEmail(request.getParameter("email"));
        contacto.setEndereco(request.getParameter("endereco"));
        LocalDate localDate = LocalDate.parse(request.getParameter("dataNascimento"), DateTimeFormatter.ISO_LOCAL_DATE);
        contacto.setDataNascimento(localDate);

        contactoDao.actualiza(contacto);

        request.setAttribute("contacto", contacto);

        return "contacto-alterado.jsp";
    }
}
