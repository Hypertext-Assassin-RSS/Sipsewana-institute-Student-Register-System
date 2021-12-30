package bo.custom;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/25/2021
 */

import bo.SuperBO;
import dto.StudentDTO;
import entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface SearchBO extends SuperBO {
    List<Student> search(String id) throws SQLException, ClassNotFoundException;
}
