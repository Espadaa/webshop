/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "knjige")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Knjige.findAll", query = "SELECT k FROM Knjige k")
    , @NamedQuery(name = "Knjige.findById", query = "SELECT k FROM Knjige k WHERE k.id = :id")
    , @NamedQuery(name = "Knjige.findByNaziv", query = "SELECT k FROM Knjige k WHERE k.naziv = :naziv")
    , @NamedQuery(name = "Knjige.findByAutor", query = "SELECT k FROM Knjige k WHERE k.autor = :autor")
    , @NamedQuery(name = "Knjige.findByGodina", query = "SELECT k FROM Knjige k WHERE k.godina = :godina")})
public class Knjige implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "naziv")
    private String naziv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "autor")
    private String autor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "godina")
    private int godina;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "knjigaId")
    private Collection<ClanKnjige> clanKnjigeCollection;

    public Knjige() {
    }

    public Knjige(Integer id) {
        this.id = id;
    }

    public Knjige(Integer id, String naziv, String autor, int godina) {
        this.id = id;
        this.naziv = naziv;
        this.autor = autor;
        this.godina = godina;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    @XmlTransient
    public Collection<ClanKnjige> getClanKnjigeCollection() {
        return clanKnjigeCollection;
    }

    public void setClanKnjigeCollection(Collection<ClanKnjige> clanKnjigeCollection) {
        this.clanKnjigeCollection = clanKnjigeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Knjige)) {
            return false;
        }
        Knjige other = (Knjige) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Knjige[ id=" + id + " ]";
    }
    
}
