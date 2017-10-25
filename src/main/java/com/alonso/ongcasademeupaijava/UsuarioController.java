/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alonso.ongcasademeupaijava;

/**
 *
 * @author Alonso Machado
 */
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
 
@ManagedBean
@SessionScoped
public class UsuarioController implements Serializable {
 
    private Usuario usuario;
 
    public UsuarioController() {
        usuario = new Usuario();
        SecurityContext context = SecurityContextHolder.getContext();
        if (context instanceof SecurityContext){
            Authentication authentication = context.getAuthentication();
            if (authentication instanceof Authentication){
                usuario.setUsername(((User)authentication.getPrincipal()).getUsername());
            }
        }
    }
 
    public Usuario getUsuario() {
        return usuario;
    }
 
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     
}
