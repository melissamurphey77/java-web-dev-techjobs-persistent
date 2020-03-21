package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity {

    //Id and Name will be the base of Employer and Skill Already
    @Id
    @GeneratedValue
    private int id;

    //Setting "rules" to Name requirements
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 75, message = "Name must be between 3 and 75 characters.")
    private String name;


    public int getId() {
        return id;
    }

//    public void setId(Integer id) { this.id = id; } I don't think I need this

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}