import entity.Program;
import entity.Student;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.io.IOException;



/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/16/2021
 */

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("view/main-window.fxml"));
        Scene scene = new Scene(load);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();

        /*Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Student student = new Student();*/

        /*
        Program program = new Program();

        program.setProgramId("CT0402");
        program.setName("Quantity Surveying");
        program.setDuration("1 year");
        program.setFee(Double.parseDouble("10000000"));
*/

       /* session.get(Student.class,"200027301776");

        System.out.println(student);

        transaction.commit();

        session.close();*/


    }
}
