package br.com.caelum.mvc.logica;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface Logica {
    String executa(ServletRequest request, ServletResponse response) throws Exception;
}
