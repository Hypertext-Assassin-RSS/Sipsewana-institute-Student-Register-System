package util;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

import Entity.Program;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    public static Session session;

    static {
        Configuration configuration = new Configuration();

        configuration.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/Sipsewana");
        configuration.setProperty("hibernate.connection.username","root");
        configuration.setProperty("hibernate.connection.password","123456");
        configuration.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
        configuration.setProperty("hibernate.show_sql","true");
        configuration.setProperty("hibernate.hbm2ddl","update");

        configuration.addAnnotatedClass(Program.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        session = sessionFactory.openSession();



    }

}
