package dto;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/23/2021
 */

public class StudentDTO {
    private String id;
    private String name;
    private String bDay;
    private String sex;
    private String address;
    private String school;
    private String program;
    private String contact;

    public StudentDTO() {
    }

    public StudentDTO(String id, String name, String bDay, String sex, String address, String school, String program, String contact) {
        this.setId(id);
        this.setName(name);
        this.setbDay(bDay);
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

    public String getbDay() {
        return bDay;
    }

    public void setbDay(String bDay) {
        this.bDay = bDay;
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
        return "StudentDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bDay='" + bDay + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", program='" + program + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
