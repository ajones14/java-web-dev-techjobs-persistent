package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 255)
    private String description;

    public Skill (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Skill (String name) {
        this.name = name;
    }

    public Skill () {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}