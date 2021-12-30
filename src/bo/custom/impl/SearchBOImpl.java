package bo.custom.impl;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/27/2021
 */

import bo.custom.SearchBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.impl.SearchDAOImpl;
import dto.StudentDTO;
import entity.Student;

import java.sql.SQLException;
import java.util.List;

public class SearchBOImpl implements SearchBO {

    SearchDAOImpl searchDAO = DAOFactory.getInstance().getDAO(DAOType.SEARCH);

    @Override
    public List<Student> search(String id) throws SQLException, ClassNotFoundException {
       return  searchDAO.search(id);
    }
}
