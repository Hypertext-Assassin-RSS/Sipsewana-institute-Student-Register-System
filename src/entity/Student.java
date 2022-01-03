package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/23/2021
 */
@Entity
public class Student implements SuperEntity {
    @Id
    private String id;
    private String name;
    private String Bday;
    private String sex;
    private String address;
    private String school;
    private String program;
    private String contact;



    public Student() {
    }

    public Student(String id, String name, String bday, String sex, String address, String school, String program, String contact) {
        this.setId(id);
        this.setName(name);
        setBday(bday);
        this.setSex(sex);
        this.setAddress(address);
        this.setSchool(school);
        this.setProgram(program);
        this.setContact(contact);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBday() {
        return Bday;
    }

    public void setBday(String bday) {
        Bday = bday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Bday='" + Bday + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", program='" + program + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
