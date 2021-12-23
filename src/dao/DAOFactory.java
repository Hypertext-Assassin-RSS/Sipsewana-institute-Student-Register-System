package dao;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

import bo.custom.impl.RegisterBOImpl;
import dao.custom.impl.ProgramDAOImpl;
import dao.custom.impl.RegisterDAOImpl;

public class DAOFactory {
    private static  DAOFactory daoFactory;
    private DAOFactory (){}

    public static DAOFactory getInstance() {
        return (null == daoFactory) ? daoFactory = new DAOFactory() : daoFactory;
    }
    public <T extends SuperDAO> T getDAO(DAOType daoType) {
        switch (daoType) {
            case PROGRAM :
                return (T) new ProgramDAOImpl();
            case REGISTER:
                return (T) new RegisterDAOImpl();
            default:
                return null;
        }
    }
}
