package controller;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/16/2021
 */

import bo.BOFactory;
import bo.BOTypes;
import bo.custom.RegisterBO;
import com.jfoenix.controls.*;
import dto.ProgramDTO;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.sql.SQLException;
import java.util.List;

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

    RegisterBO registerBO = (RegisterBO) BOFactory.getInstance().getBO(BOTypes.REGISTER);

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

    }
}



