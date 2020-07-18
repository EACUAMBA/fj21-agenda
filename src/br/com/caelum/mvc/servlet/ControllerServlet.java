package br.com.caelum.mvc.servlet;

import br.com.caelum.mvc.logica.Logica;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/mvc")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomeDaLogica = req.getParameter("logica");
        try {
            Class<?> classe =Class.forName("br.com.caelum.mvc.logica." + nomeDaLogica);

            Logica logica = (Logica)classe.newInstance();
            String pagina = logica.executa(req, resp);

            req.getRequestDispatcher("/WEB-INF/jsp/feedbacks/"+pagina).forward(req, resp);
        } catch (Exception e) {
            throw new ServletException("A nossa Servlet causou uma excepção " + e);
        }
    }
}
