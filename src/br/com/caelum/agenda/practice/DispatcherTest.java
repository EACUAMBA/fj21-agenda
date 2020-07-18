package br.com.caelum.agenda.practice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/dispatcher")
public class DispatcherTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Edilson");
        printWriter.flush();
        printWriter.close();
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/practice/DispatcherTest.jsp?nome=Edilson");
        requestDispatcher.include(req, resp);
//        requestDispatcher.forward(req, resp);// O dispacher aqui não funcioonaporque o servlet ja deu a response, e no HTTP, o protocolo, nao tem como voltar atras e enviar novamnete o dispatcher. por isso não vai funcionar
    }
}
