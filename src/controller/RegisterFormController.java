package controller;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/16/2021
 */

import bo.BOFactory;
import bo.BOTypes;
import bo.custom.RegisterBO;
import bo.custom.Student_ProgramBO;
import bo.custom.impl.RegisterBOImpl;
import com.jfoenix.controls.*;
import dto.ProgramDTO;
import dto.StudentDTO;
import dto.Student_ProgramDTO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class RegisterFormController {

    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXDatePicker txtBday;

    @FXML
    private JFXRadioButton radioMale;

    @FXML
    private JFXRadioButton radioFemale;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtSchool;

    @FXML
    private JFXComboBox<String> cmbCourse;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtPname;

    @FXML
    private JFXTextField txtPcontact;

    @FXML
    private JFXButton btnReset;

    @FXML
    private JFXButton btnSubmit;

    private String sex;

    @FXML
    private Label Warning1;


    Student_ProgramBO studentProgramBO = (Student_ProgramBO) BOFactory.getInstance().getBO(BOTypes.STUDENT_PROGRAM);
    RegisterBO registerBO = (RegisterBO) BOFactory.getInstance().getBO(BOTypes.REGISTER);

    @FXML
    void Clear(MouseEvent event) {
        txtId.clear();
        txtName.clear();
        txtName.clear();
        txtAddress.clear();
        txtSchool.clear();
        txtContact.clear();
        txtPname.clear();
        txtPcontact.clear();
    }

    public void initialize() {
        loadAllPrograms();
    }

    private void loadAllPrograms() {
        try {
            List<ProgramDTO> all = registerBO.findAll();
            for (ProgramDTO programDTO : all) {
                cmbCourse.getItems().add(programDTO.getName());

            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, "Failed to load customer ids").show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @FXML
    void Submit(MouseEvent event) {
        if (radioFemale.isSelected()) {
            sex = "Female";
        }
        if (radioMale.isSelected()) {
            sex = "Male";
        }
        String id = txtId.getText();
        String name = txtName.getText();
        String bDay = String.valueOf(txtBday.getValue());
        String address = txtAddress.getText();
        String school = txtSchool.getText();
        String program =cmbCourse.getValue();
        String contact = txtContact.getText();

        String nId = txtId.getText() + txtName.getText();
        String sId = txtId.getText();
        String sName = txtName.getText();
        String pName = cmbCourse.getValue();

        /*System.out.println(Bday);*/

        try {
            if (registerBO.add(new StudentDTO(id,name,bDay,sex,address,school,program,contact)));{
                new Alert(Alert.AlertType.CONFIRMATION,"Are You Sure").showAndWait();
                /*txtId.setText(null);
                txtName.setText(null);
                txtBday.setValue(null);
                txtAddress.setText(null);
                txtSchool.setText(null);
                cmbCourse.setValue(null);
                txtContact.setText(null);*/
            }
        }catch (Exception e){
            new Alert(Alert.AlertType.ERROR,"Error"+ e).showAndWait();
        }
        try {
            if (studentProgramBO.add(new Student_ProgramDTO(nId, sName, pName, sId)));{

            }
        } catch (Exception exception) {
            new Alert(Alert.AlertType.ERROR, "Error" + exception).showAndWait();
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
}



