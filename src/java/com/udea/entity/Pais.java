/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lfernando.orozco
 */
@Entity
@Table(name = "Pais", catalog = "Paises", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p"),
    @NamedQuery(name = "Pais.findByCode", query = "SELECT p FROM Pais p WHERE p.code = :code"),
    @NamedQuery(name = "Pais.findByName", query = "SELECT p FROM Pais p WHERE p.name = :name"),
    @NamedQuery(name = "Pais.findByContinent", query = "SELECT p FROM Pais p WHERE p.continent = :continent"),
    @NamedQuery(name = "Pais.findByRegion", query = "SELECT p FROM Pais p WHERE p.region = :region"),
    @NamedQuery(name = "Pais.findByPopulation", query = "SELECT p FROM Pais p WHERE p.population = :population"),
    @NamedQuery(name = "Pais.findByCapital", query = "SELECT p FROM Pais p WHERE p.capital = :capital")})
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "Code", nullable = false, length = 3)
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 52)
    @Column(name = "Name", nullable = false, length = 52)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Continent", nullable = false, length = 100)
    private String continent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "Region", nullable = false, length = 26)
    private String region;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Population", nullable = false)
    private int population;
    @Column(name = "Capital")
    private Integer capital;

    public Pais() {
    }

    public Pais(String code) {
        this.code = code;
    }

    public Pais(String code, String name, String continent, String region, int population) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.Pais[ code=" + code + " ]";
    }
    
}
