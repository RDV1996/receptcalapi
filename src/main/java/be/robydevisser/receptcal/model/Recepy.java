package be.robydevisser.receptcal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import java.util.List;

@Entity
public class Recepy {

    @Id
    private String id;

    @Version
    private int version;

    private String name;
    private String description;

    @OneToMany
    private List<RecepyItem> ingredients;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RecepyItem> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<RecepyItem> ingredients) {
        this.ingredients = ingredients;
    }
}
