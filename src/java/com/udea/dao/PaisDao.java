/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.entity.Pais;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lfernando.orozco
 */
@Stateless
public class PaisDao implements PaisDaoLocal {
 
    @PersistenceContext
    private EntityManager em; 
    @Override
    public List<Pais> getAll() {
         return em.createNamedQuery("Pais.findAll").getResultList(); 
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
