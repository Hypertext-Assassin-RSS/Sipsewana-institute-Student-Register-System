package controller;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/16/2021
 */

import com.jfoenix.controls.*;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class RegisterFormController {

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

    @FXML
    void Clear(MouseEvent event) {
        txtName.clear();
        txtName.clear();
        txtAddress.clear();
        txtSchool.clear();
        txtContact.clear();
        txtPname.clear();
        txtPcontact.clear();
    }

    public void initialize() {

    }


    @FXML
    void Submit(MouseEvent event) {
        if (radioFemale.isSelected()) {
            sex = "Female";
        }
        if (radioMale.isSelected()) {
            sex = "Male";
        }

    }
}



