package util;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

import entity.Program;
import entity.Student;
import entity.Student_Program;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryConfiguration {
    /*public static Session session;
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

    }*/
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("hibernate.properties"));
        }catch (Exception e){

        }

        Configuration configure = new Configuration().addProperties(properties)
                .addAnnotatedClass(Program.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Student_Program.class);
        sessionFactory = configure.buildSessionFactory();

        /*Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/Sipsewana");
        configuration.setProperty("hibernate.connection.username","root");
        configuration.setProperty("hibernate.connection.password","123456");
        configuration.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
        configuration.setProperty("hibernate.show_sql","true");
        configuration.setProperty("hibernate.hbm2ddl","update");

        configuration.addAnnotatedClass(Program.class).addAnnotatedClass(Student.class);

        sessionFactory = configuration.buildSessionFactory();*/
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }


}
