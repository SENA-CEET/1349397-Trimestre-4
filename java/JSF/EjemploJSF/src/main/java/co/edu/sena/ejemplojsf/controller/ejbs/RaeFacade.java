/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplojsf.controller.ejbs;

import co.edu.sena.ejemplojsf.model.entities.Rae;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Enrique
 */
@Stateless
public class RaeFacade extends AbstractFacade<Rae> {

    @PersistenceContext(unitName = "co.edu.sena_EjemploJSF_war_1.0.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RaeFacade() {
        super(Rae.class);
    }
    
}
