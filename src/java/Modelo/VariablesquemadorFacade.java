/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidad.Variablesquemador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author asus
 */
@Stateless
public class VariablesquemadorFacade extends AbstractFacade<Variablesquemador> {

    @PersistenceContext(unitName = "ProyectoHornoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VariablesquemadorFacade() {
        super(Variablesquemador.class);
    }
    
}
