package org.launchcode.javawebdevtechjobspersistent.models;




        import javax.persistence.Entity;
        import javax.persistence.ManyToMany;
        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Size;
        import java.util.ArrayList;
        import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    //extending AbstractEntity inherits id and name automatically

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @NotNull
    @Size(max = 500, message = "Description can't be more than 500 characters.")
    private String description;


    //no-arg constructor
    public Skill(){
    }

    public String getDescription() { return description;}

    public void setDescription(String description) { this.description = description;}

    public List<Job> getJob() {
        return jobs;
    }


}
