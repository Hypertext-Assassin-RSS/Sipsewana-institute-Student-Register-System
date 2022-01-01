package dao.custom;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *1/1/2022
 */

import dao.SuperDAO;
import entity.Student;
import entity.Student_Program;

public interface Student_ProgramDAO extends SuperDAO<Student_Program, Student> {
    boolean add (Student_Program studentProgram);
}

