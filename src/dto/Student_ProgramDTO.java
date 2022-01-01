package dto;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *1/1/2022
 */

public class Student_ProgramDTO {
    private String id;
    private String sId;
    private String sName;
    private String  pName;

    public Student_ProgramDTO() {
    }

    public Student_ProgramDTO(String id, String sId, String sName, String pName) {
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
        return "Student_ProgramDTO{" +
                "id='" + id + '\'' +
                ", sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }
}
