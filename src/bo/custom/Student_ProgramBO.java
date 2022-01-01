package bo.custom;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *1/1/2022
 */

import bo.SuperBO;
import dto.Student_ProgramDTO;

public interface Student_ProgramBO extends SuperBO {
    public boolean add(Student_ProgramDTO studentProgramDTO);
}
