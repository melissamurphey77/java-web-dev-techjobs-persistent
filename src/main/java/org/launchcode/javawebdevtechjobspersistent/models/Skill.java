package org.launchcode.javawebdevtechjobspersistent.models;




import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {
    //extending AbstractEntity inherits id and name automatically

    private String skill;
    //this adds skill and description to the id and name we already have to Skill

    //no-arg constructor
    public Skill(){
    }

    //validation
    public Skill(String skill){
        this.skill = skill;
    }


    public String getSkill() { return skill; }

    public void setSkill(String skill) { this.skill = skill; }


}
