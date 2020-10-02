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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "clan_knjige")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClanKnjige.findAll", query = "SELECT c FROM ClanKnjige c")
    , @NamedQuery(name = "ClanKnjige.findById", query = "SELECT c FROM ClanKnjige c WHERE c.id = :id")})
public class ClanKnjige implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "clan_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Clanovi clanId;
    @JoinColumn(name = "knjiga_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Knjige knjigaId;

    public ClanKnjige() {
    }

    public ClanKnjige(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Clanovi getClanId() {
        return clanId;
    }

    public void setClanId(Clanovi clanId) {
        this.clanId = clanId;
    }

    public Knjige getKnjigaId() {
        return knjigaId;
    }

    public void setKnjigaId(Knjige knjigaId) {
        this.knjigaId = knjigaId;
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
        if (!(object instanceof ClanKnjige)) {
            return false;
        }
        ClanKnjige other = (ClanKnjige) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ClanKnjige[ id=" + id + " ]";
    }
    
}
