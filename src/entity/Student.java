package entity;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/23/2021
 */

import javax.persistence.ManyToOne;
import java.util.Date;

public class Student {
    private String name;
    private Date Bday;
    private String sex;
    private String address;
    private String school;
    private String program;
    private String contact;

    @ManyToOne
    private
    Parent parent;

    public Student() {
    }

    public Student(String name, Date bday, String sex, String address, String school, String program, String contact, Parent parent) {
        this.setName(name);
        setBday(bday);
        this.setSex(sex);
        this.setAddress(address);
        this.setSchool(school);
        this.setProgram(program);
        this.setContact(contact);
        this.setParent(parent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBday() {
        return Bday;
    }

    public void setBday(Date bday) {
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

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Bday=" + Bday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", program='" + program + '\'' +
                ", contact='" + contact + '\'' +
                ", parent=" + parent +
                '}';
    }
}
