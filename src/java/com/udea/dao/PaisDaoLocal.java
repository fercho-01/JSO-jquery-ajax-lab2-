/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.entity.Pais;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lfernando.orozco
 */
@Local
public interface PaisDaoLocal {

    List<Pais> getAll();
    
}
