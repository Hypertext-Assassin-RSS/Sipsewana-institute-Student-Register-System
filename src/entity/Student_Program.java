package entity;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *1/1/2022
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity(name = "")
public class Student_Program implements SuperEntity{
    @Id
    private
    String id;
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private
    String sId;
    @JoinColumn(name = "student_name",referencedColumnName = "name")
    private
    String sName;
    @JoinColumn(name = "program_name",referencedColumnName = "name")
    private
    String pName;

    public Student_Program() {
    }

    public Student_Program(String id, String sId, String sName, String pName) {
        this.setId(id);
        this.setsId(sId);
        this.setsName(sName);
        this.setpName(pName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Student_Program{" +
                "id='" + id + '\'' +
                ", sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }
}
