package org.launchcode.javawebdevtechjobspersistent.models;




import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    //extending AbstractEntity inherits id and name automatically

    //these adds skill and description to the id and name we already have to Skill
    private String skill;

    @Size(max = 500, message = "Description can't be more than 500 characters.")
    private String description;


    //no-arg constructor
    public Skill(){
    }

    //validation
    public Skill(String skill, String description){
        this.skill = skill;
        this.description = description;
    }


    public String getSkill() { return skill; }

    public void setSkill(String skill) { this.skill = skill; }

    public String getDescription() { return description;}

    public void setDescription(String description) { this.description = description;}


}
