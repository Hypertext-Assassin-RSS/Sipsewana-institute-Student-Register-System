package bo;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

import bo.custom.impl.ProgramBOImpl;

public class BOFactory {
    private static  BOFactory boFactory;

    private BOFactory () {}

    public static  BOFactory getInstance(){
        return (null == boFactory) ? boFactory = new BOFactory() : boFactory;
    }
    public <T extends SuperBO> T getBO(BOTypes boTypes) {
        switch (boTypes) {
            case PROGRAM :
                return (T) new ProgramBOImpl();
            default:
                return null;
        }

    }
}
