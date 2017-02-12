/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portsgroup;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Sepid
 */
@Entity
@Table(name = "albums")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Albums.findAll", query = "SELECT a FROM Albums a")
    , @NamedQuery(name = "Albums.findByAlbumId", query = "SELECT a FROM Albums a WHERE a.albumId = :albumId")
    , @NamedQuery(name = "Albums.findByNameAlbum", query = "SELECT a FROM Albums a WHERE a.nameAlbum = :nameAlbum")
    , @NamedQuery(name = "Albums.findByYear", query = "SELECT a FROM Albums a WHERE a.year = :year")})
public class Albums implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "album_id")
    private Integer albumId;
    @Size(max = 50)
    @Column(name = "name_album")
    private String nameAlbum;
    @Column(name = "year")
    private Integer year;
    @JoinColumn(name = "id_singer", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Singer idSinger;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAlbum")
    private Set<Tracks> tracksSet;

    public Albums() {
    }

    public Albums(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Singer getIdSinger() {
        return idSinger;
    }

    public void setIdSinger(Singer idSinger) {
        this.idSinger = idSinger;
    }

    @XmlTransient
    public Set<Tracks> getTracksSet() {
        return tracksSet;
    }

    public void setTracksSet(Set<Tracks> tracksSet) {
        this.tracksSet = tracksSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (albumId != null ? albumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Albums)) {
            return false;
        }
        Albums other = (Albums) object;
        if ((this.albumId == null && other.albumId != null) || (this.albumId != null && !this.albumId.equals(other.albumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + albumId + "";
    }
    
}
