package dao.custom.impl;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/27/2021
 */

import dao.custom.SearchDAO;
import entity.Program;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.sql.SQLException;
import java.util.List;

public class SearchDAOImpl implements SearchDAO {
    @Override
    public boolean add(Program entity) {
        return false;
    }

    @Override
    public List<Student> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Student> search(String id) throws SQLException, ClassNotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        List<Student> list = null;

        Query student = session.createQuery("from student where id = id");
        list = student.list();

        transaction.commit();

        session.close();

        return list;
    }
}
