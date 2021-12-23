package entity;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "program")
public class Program implements SuperEntity {
    @Id
    private String Id;
    private String name;
    private String duration;
    private double fee;


    public Program() {
    }

    public Program(String id, String name, String duration, double fee) {
        setId(id);
        this.setName(name);
        this.setDuration(duration);
        this.setFee(fee);
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "Program{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", fee=" + fee +
                '}';
    }

}
