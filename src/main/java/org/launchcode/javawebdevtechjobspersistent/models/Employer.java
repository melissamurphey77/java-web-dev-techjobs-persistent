package org.launchcode.javawebdevtechjobspersistent.models;




import javax.persistence.Entity;

@Entity
public class Employer extends AbstractEntity {
    //extending AbstractEntity inherits id and name automatically

    private String location;
    //this adds location to the id and name we already have to Employer

    //no-arg constructor required for Hibernate to create an object.
    public Employer(){
    }

    //validation
    public Employer(String location){
        this.location = location;
    }


    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}


}
