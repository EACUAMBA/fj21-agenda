package br.com.caelum.mvc.logica;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class OptionsLogic implements Logica {
    @Override
    public String executa(ServletRequest request, ServletResponse response) throws Exception {
        return "options.jsp";
    }
}
