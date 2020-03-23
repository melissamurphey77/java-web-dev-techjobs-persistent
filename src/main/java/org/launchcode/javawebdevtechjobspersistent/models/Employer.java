package org.launchcode.javawebdevtechjobspersistent.models;




import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    //extending AbstractEntity inherits id and name automatically

    @OneToMany
    @JoinColumn
    private List<Job> jobs= new ArrayList<>();

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
