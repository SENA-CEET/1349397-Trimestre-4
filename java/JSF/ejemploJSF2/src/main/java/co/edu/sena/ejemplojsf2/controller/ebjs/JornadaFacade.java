/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplojsf2.controller.ebjs;

import co.edu.sena.ejemplojsf2.model.entities.Jornada;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Enrique
 */
@Stateless
public class JornadaFacade extends AbstractFacade<Jornada> {

    @PersistenceContext(unitName = "co.edu.sena_ejemploJSF2_war_1.0.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JornadaFacade() {
        super(Jornada.class);
    }
    
}
