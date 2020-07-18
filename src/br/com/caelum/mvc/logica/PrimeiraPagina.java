package br.com.caelum.mvc.logica;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PrimeiraPagina implements Logica {
    @Override
    public String executa(ServletRequest request, ServletResponse response) throws Exception {
        System.out.println("Executando a Logica....");
        System.out.println("Retornando o nome da pagina jsp....");
        return "primeira-logica.jsp";
    }
}
