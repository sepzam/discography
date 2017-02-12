package com.mycompany.portsgroup;

import com.mycompany.portsgroup.Albums;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-12T10:09:09")
@StaticMetamodel(Singer.class)
public class Singer_ { 

    public static volatile SetAttribute<Singer, Albums> albumsSet;
    public static volatile SingularAttribute<Singer, String> name;
    public static volatile SingularAttribute<Singer, Integer> id;

}