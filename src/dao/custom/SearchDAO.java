package dao.custom;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/27/2021
 */

import dao.SuperDAO;
import entity.Program;
import entity.Student;

import java.util.List;

public interface SearchDAO extends SuperDAO<Student, Program> {

     Student search(String id) throws Exception;

     boolean delete(String id);

}
