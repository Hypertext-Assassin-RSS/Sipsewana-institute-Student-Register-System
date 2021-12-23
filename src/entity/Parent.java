package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/23/2021
 */
@Entity
public class Parent {
    @Id
    private String name;
    private String contact;
    @OneToMany
    private List<Student> studentList = new ArrayList<>();

    public Parent() {
    }

    public Parent(String name, String contact, List<Student> studentList) {
        this.setName(name);
        this.setContact(contact);
        this.setStudentList(studentList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
