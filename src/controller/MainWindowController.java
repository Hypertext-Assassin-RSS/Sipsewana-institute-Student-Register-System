package controller;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/16/2021
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
                Stage stage1 = new Stage();
                stage1.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                stage.show();
            }
        }
    }
    @FXML
    void enter(MouseEvent event) {
        if (event.getSource() instanceof  ImageView) {
            ImageView imageView = (ImageView) event.getSource();

            Parent root = null;

            switch (imageView.getId()){
                case "iconUser" :
                    lblOption.setText("Add new Student");
                    break;
                case "iconProgram" :
                    lblOption.setText("Add new program");
                    break;
                case "iconSearch" :
                    lblOption.setText("Search Registered Student");
                    break;
                default:
                    lblOption.setText(null);
                    break;
            }
        }
    }
    @FXML
    void close(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    @FXML
    void exit(MouseEvent event) throws IOException {
        lblOption.setText("Select Option !");
    }

}
