package dao.custom;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

import entity.Program;
import dao.SuperDAO;
import entity.Student;

public interface ProgramDAO extends SuperDAO <Program, Student> {
    boolean add(Program entity);

}
