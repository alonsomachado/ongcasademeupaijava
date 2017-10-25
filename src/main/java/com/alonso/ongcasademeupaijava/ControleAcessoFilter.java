/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alonso.ongcasademeupaijava;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.annotation.WebFilter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import com.alonso.ongcasademeupaijava.SessaoMB;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alonso Machado
 */

@WebFilter(servletNames = {"Faces servlet"})
public class ControleAcessoFilter implements Filter  
{
    @Inject
    //FacesContext context = FacesContext.getCurrentInstance();
    protected SessaoMB sessao;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession ses = req.getSession();
        String url = req.getRequestURL().toString();
        /*if(sessao.getUsuario()==null){
            resp.sendRedirect("ongCasaDeMeuPaiJava/index.xhtml");
            return;
        }*/
        //if(usuDAO.getUsuario(usuario, senha)!=null)
        if(!"guilherme".equals(sessao.getUsuario())){
        } else {
            resp.sendRedirect(req.getServletContext().getContextPath()+"/index.xhtml");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }
    
}
