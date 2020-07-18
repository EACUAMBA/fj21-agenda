package br.com.caelum.agenda.filtro;

import br.com.caelum.agenda.jdbc.dao.ConnectionFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebFilter("/*")
public class FiltroConnection implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try{
            System.out.println("Criando connexao");
            Connection connection = new ConnectionFactory().getConnection();

            servletRequest.setAttribute("connection", connection);

            filterChain.doFilter(servletRequest, servletResponse);
            System.out.println("Fechando Conexao");
            connection.close();
        }catch(SQLException e){
            throw new ServletException(e);
        }
    }

    @Override
    public void destroy() {

    }
}
