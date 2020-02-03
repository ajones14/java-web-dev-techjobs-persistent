package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 255)
    private String description;

    @ManyToMany(mappedBy = "skills")
    public List<Job> job = new ArrayList<>();

    public Skill (String name, String description) {
        super(name);
        this.description = description;
    }

    public Skill (String name) {
        super(name);
    }

    public Skill () {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}