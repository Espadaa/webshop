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
@Table(name = "clanovi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clanovi.findAll", query = "SELECT c FROM Clanovi c")
    , @NamedQuery(name = "Clanovi.findById", query = "SELECT c FROM Clanovi c WHERE c.id = :id")
    , @NamedQuery(name = "Clanovi.findByIme", query = "SELECT c FROM Clanovi c WHERE c.ime = :ime")
    , @NamedQuery(name = "Clanovi.findByPrezime", query = "SELECT c FROM Clanovi c WHERE c.prezime = :prezime")
    , @NamedQuery(name = "Clanovi.findByGodine", query = "SELECT c FROM Clanovi c WHERE c.godine = :godine")
    , @NamedQuery(name = "Clanovi.findByEmail", query = "SELECT c FROM Clanovi c WHERE c.email = :email")
    , @NamedQuery(name = "Clanovi.findByLozinka", query = "SELECT c FROM Clanovi c WHERE c.lozinka = :lozinka")})
public class Clanovi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ime")
    private String ime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "prezime")
    private String prezime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "godine")
    private int godine;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "lozinka")
    private String lozinka;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clanId")
    private Collection<ClanKnjige> clanKnjigeCollection;

    public Clanovi() {
    }

    public Clanovi(Integer id) {
        this.id = id;
    }

    public Clanovi(Integer id, String ime, String prezime, int godine, String email, String lozinka) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.email = email;
        this.lozinka = lozinka;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
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
        if (!(object instanceof Clanovi)) {
            return false;
        }
        Clanovi other = (Clanovi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Clanovi[ id=" + id + " ]";
    }
    
}
