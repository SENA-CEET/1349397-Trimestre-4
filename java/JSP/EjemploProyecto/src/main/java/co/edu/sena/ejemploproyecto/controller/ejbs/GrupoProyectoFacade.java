/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploproyecto.controller.ejbs;

import co.edu.sena.ejemploproyecto.model.entities.GrupoProyecto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Enrique
 */
@Stateless
public class GrupoProyectoFacade extends AbstractFacade<GrupoProyecto> {

    @PersistenceContext(unitName = "co.edu.sena_EjemploProyecto_war_1.0.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GrupoProyectoFacade() {
        super(GrupoProyecto.class);
    }
    
}
