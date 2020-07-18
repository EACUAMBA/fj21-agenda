package br.com.caelum.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.jdbc.dao.ContactoDao;
import br.com.caelum.agenda.jdbc.modelo.Contacto;

@WebServlet("/adiciona-contacto")
public class AdicionaContactoServlet extends HttpServlet {
    @Override
    public void init(ServletConfig conf) throws ServletException {
        // TODO Auto-generated method stub
        super.init(conf);
        log("Iniciando o Servlet");
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        super.destroy();
        log("Destruindo o Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String endereco = request.getParameter("endereco");
        String data_Nascimento = request.getParameter("dataNascimento");
        LocalDate localDate = LocalDate.parse(data_Nascimento, DateTimeFormatter.ISO_LOCAL_DATE);
        Contacto contacto = new Contacto();
        contacto.setNome(nome);
        contacto.setEmail(email);
        contacto.setEndereco(endereco);
        contacto.setDataNascimento(localDate);
       // new ContactoDao().adiciona(contacto);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/feedbacks/contacto-adicionado.jsp?nome="+nome+"");
        requestDispatcher.forward(request, response);

    }

}
