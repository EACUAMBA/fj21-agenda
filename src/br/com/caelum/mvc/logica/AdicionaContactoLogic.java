package br.com.caelum.mvc.logica;

import br.com.caelum.agenda.jdbc.dao.ContactoDao;
import br.com.caelum.agenda.jdbc.modelo.Contacto;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdicionaContactoLogic implements Logica {
    @Override
    public String executa(ServletRequest request, ServletResponse response) throws Exception {
        Contacto contacto = new Contacto();
        contacto.setNome(request.getParameter("nome"));
        contacto.setEmail(request.getParameter("email"));
        contacto.setEndereco(request.getParameter("endereco"));
        contacto.setDataNascimento(LocalDate.parse(request.getParameter("dataNascimento"), DateTimeFormatter.ISO_LOCAL_DATE));

        new ContactoDao((Connection)request.getAttribute("connection")).adiciona(contacto);

        return "contacto-adicionado.jsp";
    }
}
