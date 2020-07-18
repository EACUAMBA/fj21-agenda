package br.com.caelum.agenda.filtro;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class FiltroTempoDeExecuxao implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long tempoInicial = System.currentTimeMillis();

        filterChain.doFilter(servletRequest, servletResponse);

        long tempoFinal = System.currentTimeMillis();
        String uri = ((HttpServletRequest)servletRequest).getRequestURI();
        String parametros = ((HttpServletRequest)servletRequest).getParameter("logica");
        System.out.println("O tempo de requisicao de " + uri + "?logica=" + parametros + " demorou(em ms) " + (tempoFinal-tempoInicial));

    }

    @Override
    public void destroy() {

    }
}
