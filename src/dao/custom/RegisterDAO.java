package dao.custom;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/23/2021
 */

import dao.SuperDAO;
import entity.Program;
import entity.Student;

import java.util.List;

public interface RegisterDAO extends SuperDAO<Program, Student> {
    public boolean add (Student entity);

    public List<Program> findAll() throws Exception;
}
