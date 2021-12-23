package controller;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/16/2021
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {
    @FXML
    private AnchorPane root;

    @FXML
    private ImageView iconUser;

    @FXML
    private ImageView iconProgram;

    @FXML
    private ImageView iconSearch;

    @FXML
    private Label lblOption;

    public void initialize () {

    }

    @FXML
    void navigate(MouseEvent event) throws IOException {
        if (event.getSource() instanceof  ImageView) {
            ImageView imageView = (ImageView) event.getSource();

            Parent root = null;

            switch (imageView.getId()) {
                case "iconUser":
                    root = FXMLLoader.load(getClass().getResource("/view/register-form.fxml"));
                    break;
                case "iconProgram":
                    root = FXMLLoader.load(getClass().getResource("/view/program-form.fxml"));
                    break;
                case "iconSearch":
                    root = FXMLLoader.load(getClass().getResource("/view/search-form.fxml"));

            }

            if (root != null) {
                Scene scene = new Scene(root);
                Stage stage = (Stage) this.root.getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }
        }
    }
}
