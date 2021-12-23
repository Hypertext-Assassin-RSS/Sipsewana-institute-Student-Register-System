package dao.custom.impl;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/23/2021
 */

import dao.custom.RegisterDAO;
import entity.Program;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.util.List;

public class RegisterDAOImpl implements RegisterDAO {
    @Override
    public boolean add(Program entity) {
        return false;
    }

    @Override
    public List<Program> findAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        List<Program> list = null;

        Query programs = session.createQuery("from program");
        list = programs.list();

        transaction.commit();

        session.close();
        return list;
    }
}
