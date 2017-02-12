package com.mycompany.portsgroup;

import com.mycompany.portsgroup.Singer;
import com.mycompany.portsgroup.Tracks;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-12T10:09:09")
@StaticMetamodel(Albums.class)
public class Albums_ { 

    public static volatile SingularAttribute<Albums, Singer> idSinger;
    public static volatile SingularAttribute<Albums, String> nameAlbum;
    public static volatile SingularAttribute<Albums, Integer> year;
    public static volatile SetAttribute<Albums, Tracks> tracksSet;
    public static volatile SingularAttribute<Albums, Integer> albumId;

}