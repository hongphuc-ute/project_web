/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "category")
@NamedQueries({
    @NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c"),
    @NamedQuery(name = "Category.findByMaTheLoai", query = "SELECT c FROM Category c WHERE c.maTheLoai = :maTheLoai"),
    @NamedQuery(name = "Category.findByMoTa", query = "SELECT c FROM Category c WHERE c.moTa = :moTa"),
    @NamedQuery(name = "Category.findByTenTheLoai", query = "SELECT c FROM Category c WHERE c.tenTheLoai = :tenTheLoai")})
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma_the_loai")
    private Integer maTheLoai;
    @Size(max = 255)
    @Column(name = "mo_ta")
    private String moTa;
    @Size(max = 255)
    @Column(name = "ten_the_loai")
    private String tenTheLoai;

    public Category() {
    }

    public Category(Integer maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public Integer getMaTheLoai() {
        return maTheLoai;
    }

    public void setMaTheLoai(Integer maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTheLoai != null ? maTheLoai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.maTheLoai == null && other.maTheLoai != null) || (this.maTheLoai != null && !this.maTheLoai.equals(other.maTheLoai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Category[ maTheLoai=" + maTheLoai + " ]";
    }
    
}
