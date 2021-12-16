package controller;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/16/2021
 */

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class MainFormController {

    @FXML
    private TextField txtName;

    @FXML
    private DatePicker txtBday;

    @FXML
    private CheckBox txtMale;

    @FXML
    private CheckBox txtFemale;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtSchool;

    @FXML
    private ComboBox<?> cmbCourse;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtPname;

    @FXML
    private TextField txtPcontact;

    @FXML
    private JFXButton btnReset;

    @FXML
    private JFXButton btnSubmit;

    public MainFormController() {

    }
}
