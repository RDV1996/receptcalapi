/*
 Author:Roby de Visser
*/

package be.robydevisser.receptcal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class User {

    @Id
    private String id;

    @Version
    private int version;

    private String email;
    private String password;
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String UUID) {
        this.id = UUID;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

