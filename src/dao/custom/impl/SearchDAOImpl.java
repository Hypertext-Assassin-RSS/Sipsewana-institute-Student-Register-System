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
    public Student search(String id) throws SQLException, ClassNotFoundException {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        List<Student> list = null;

        /*Query student = session.createQuery("FROM student s WHERE s.id =:id");*/
        Student student = session.get(Student.class,id);

        transaction.commit();

        session.close();

        return student;
    }

    @Override
    public boolean delete(String id) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.delete(id,Student.class);

        transaction.commit();

        session.close();

        return true;
    }
}
