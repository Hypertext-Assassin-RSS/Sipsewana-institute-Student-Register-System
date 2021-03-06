package controller;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/23/2021
 */

import bo.BOFactory;
import bo.BOTypes;
import bo.custom.SearchBO;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.impl.SearchDAOImpl;
import dto.StudentDTO;
import entity.Student;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchFormController {

    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtProgram;

    @FXML
    private JFXButton btnSearch;

    public void initialize() {

    }
    SearchDAOImpl searchDAO =  DAOFactory.getInstance().getDAO(DAOType.SEARCH);

    SearchBO searchBO = (SearchBO) BOFactory.getInstance().getBO(BOTypes.SEARCH);

    @FXML
     void search(MouseEvent event) throws SQLException, ClassNotFoundException {
        String id = txtId.getText();
        /*searchBO.search(id);*/

        {
            try {
                Student student = searchBO.search(id);
                    txtName.setText(student.getName());
                    txtAddress.setText(student.getAddress());
                    txtContact.setText(student.getContact());
                    txtProgram.setText(student.getProgram());

                } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        }
    }
    @FXML
    void close(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
        Parent load = FXMLLoader.load(getClass().getResource("/view/main-window.fxml"));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void delete(MouseEvent event) {
        String id = txtId.getText();
        if (searchBO.delete(id)){
            new Alert(Alert.AlertType.CONFIRMATION,"Are You Sure ?").showAndWait();
        }else{
            new Alert(Alert.AlertType.ERROR).showAndWait();
        }
    }

}
