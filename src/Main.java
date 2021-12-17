import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        primaryStage.setScene(scene);
        primaryStage.show();

        /*Session session = FactoryConfiguration.session.getSession();

        Transaction transaction = session.beginTransaction();


        Program program = new Program();

        program.setProgramId("CT0402");
        program.setName("Quantity Surveying");
        program.setDuration("1 year");
        program.setFee(Double.parseDouble("10000000"));

        session.save(program);

        transaction.commit();

        session.close();*/


    }
}
