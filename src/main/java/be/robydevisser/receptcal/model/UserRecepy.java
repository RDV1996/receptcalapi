package be.robydevisser.receptcal.model;

import javax.persistence.*;

@Entity
public class UserRecepy {

    @Id
    private String id;

    @Version
    private int version;

    @ManyToOne
    private User user;

    @ManyToOne
    private Recepy recepy;

}
