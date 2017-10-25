/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alonso.ongcasademeupaijava;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alonso Machado
 */
@Stateless
public class AcolhimentoFacade extends AbstractFacade<Acolhimento> {

    @PersistenceContext(unitName = "com.alonso_ongCasaDeMeuPaiJava_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AcolhimentoFacade() {
        super(Acolhimento.class);
    }
    
}
