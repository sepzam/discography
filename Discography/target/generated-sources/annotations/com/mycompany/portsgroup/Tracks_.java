package com.mycompany.portsgroup;

import com.mycompany.portsgroup.Albums;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-12T10:09:09")
@StaticMetamodel(Tracks.class)
public class Tracks_ { 

    public static volatile SingularAttribute<Tracks, Integer> trackId;
    public static volatile SingularAttribute<Tracks, Albums> idAlbum;
    public static volatile SingularAttribute<Tracks, String> nameTrack;

}