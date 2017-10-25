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
import java.util.Date;
   
  import javax.persistence.Column;
  import javax.persistence.Entity;
  import javax.persistence.Id;
  import javax.persistence.Temporal;
  import javax.persistence.TemporalType;
@Entity
public class Usuario {
        
        @Id
        @Column(name="id", nullable=false, unique=true)
        private int id;
        
        @Column(name="username", nullable=false, unique=true)
        private String username;
        
        @Column(name="password", nullable=false, unique=false)
        private String senha;
   
        @Column(name="lastAccess", unique=true)
        @Temporal(TemporalType.DATE)
        private Date ultimoAcesso;

        
        public String getUsername() {
              return username;
        }
        
        public void setUsername(String username) {
              this.username = username;
        }
        
        public String getSenha() {
              return senha;
        }
        
        public void setSenha(String senha) {
              this.senha = senha;
        }
        
        public Date getUltimoAcesso() {
              return ultimoAcesso;
        }
        
        public void setUltimoAcesso(Date ultimoAcesso) {
              this.ultimoAcesso = ultimoAcesso;
        }
}
