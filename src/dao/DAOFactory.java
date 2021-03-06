package dao;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

import bo.custom.impl.RegisterBOImpl;
import dao.custom.impl.ProgramDAOImpl;
import dao.custom.impl.RegisterDAOImpl;
import dao.custom.impl.SearchDAOImpl;
import dao.custom.impl.Student_ProgramDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return (null == daoFactory) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public <T extends SuperDAO> T getDAO(DAOType daoType) {
        switch (daoType) {
            case PROGRAM:
                return (T) new ProgramDAOImpl();
            case REGISTER:
                return (T) new RegisterDAOImpl();
            case SEARCH:
                return (T) new SearchDAOImpl();
            case STUDENT_PROGRAM:
                return (T) new Student_ProgramDAOImpl();
            default:
                return null;
        }
    }
}
