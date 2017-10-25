/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alonso.ongcasademeupaijava;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Alonso Machado
 */

@Named
//@ApplicationScoped
@SessionScoped
public class SessaoMB implements Serializable {
    private String usuario;
    private String senha;
    //private UsuarioDAO usuDAO;
    private Usuario usu = new Usuario();
    private int token = 0;
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the token
     */
    public int getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(int token) {
        this.token = token;
    }
       
    public void login(){
        
        if(getUsuario().equalsIgnoreCase("guilherme") && getSenha().equals("casa67gama")){
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Usuario Logado","Usuario Logado"));
            setToken(6731);
            //return "/acolhimento/list.xhtml";
        }else{
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario ou Senha errados","Usuario ou Senha errados"));
            setToken(0);
        }
    }
    public void logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        setToken(0);
    }
}
