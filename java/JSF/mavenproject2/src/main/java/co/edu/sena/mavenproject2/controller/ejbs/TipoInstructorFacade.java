/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.mavenproject2.controller.ejbs;

import co.edu.sena.mavenproject2.model.entities.TipoInstructor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Enrique
 */
@Stateless
public class TipoInstructorFacade extends AbstractFacade<TipoInstructor> {

    @PersistenceContext(unitName = "co.edu.sena_mavenproject2_war_1.0.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoInstructorFacade() {
        super(TipoInstructor.class);
    }
    
}
