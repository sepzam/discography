/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portsgroup;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sepid
 */
@Entity
@Table(name = "tracks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tracks.findAll", query = "SELECT t FROM Tracks t")
    , @NamedQuery(name = "Tracks.findByTrackId", query = "SELECT t FROM Tracks t WHERE t.trackId = :trackId")
    , @NamedQuery(name = "Tracks.findByNameTrack", query = "SELECT t FROM Tracks t WHERE t.nameTrack = :nameTrack")})
public class Tracks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "track_id")
    private Integer trackId;
    @Size(max = 50)
    @Column(name = "name_track")
    private String nameTrack;
    @JoinColumn(name = "id_album", referencedColumnName = "album_id")
    @ManyToOne(optional = false)
    private Albums idAlbum;

    public Tracks() {
    }

    public Tracks(Integer trackId) {
        this.trackId = trackId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getNameTrack() {
        return nameTrack;
    }

    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack;
    }

    public Albums getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Albums idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trackId != null ? trackId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tracks)) {
            return false;
        }
        Tracks other = (Tracks) object;
        if ((this.trackId == null && other.trackId != null) || (this.trackId != null && !this.trackId.equals(other.trackId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + trackId + "";
    }
    
}
