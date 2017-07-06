package br.edu.ctup.chatrest.rest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CorsFilter
 */
@WebFilter("/*")
public class CorsFilter implements Filter {

	@Override
    public void doFilter(ServletRequest request, ServletResponse response,
    FilterChain filterChain) throws IOException, ServletException {

        if(response instanceof HttpServletResponse){
        HttpServletResponse alteredResponse = ((HttpServletResponse)response);
        addCorsHeader(alteredResponse);
    }

    filterChain.doFilter(request, response);
    }

    private void addCorsHeader(HttpServletResponse response){
        //TODO: externalize the Allow-Origin
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
        response.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
        response.addHeader("Access-Control-Max-Age", "1728000");
    }

    @Override
    public void destroy() {}

    @Override
    public void init(FilterConfig filterConfig)throws ServletException{}

}
