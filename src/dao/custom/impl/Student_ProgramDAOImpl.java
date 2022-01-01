package dao.custom.impl;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *1/1/2022
 */

import dao.custom.Student_ProgramDAO;
import entity.Student_Program;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Student_ProgramDAOImpl implements Student_ProgramDAO {
    @Override
    public boolean add(Student_Program studentProgram) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(studentProgram);

        transaction.commit();

        session.close();

        return true;
    }
}
