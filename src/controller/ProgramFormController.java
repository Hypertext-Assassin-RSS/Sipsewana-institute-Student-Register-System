package controller;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/16/2021
 */

import bo.BOFactory;
import bo.BOTypes;
import bo.custom.impl.ProgramBOImpl;
import dto.ProgramDTO;
import entity.Program;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class ProgramFormController {
    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtDuration;

    @FXML
    private JFXTextField txtFee;

    @FXML
    private JFXButton btnReset;

    @FXML
    private JFXButton btnSubmit;

    ProgramBOImpl programBOImpl = BOFactory.getInstance().getBO(BOTypes.PROGRAM);



    @FXML
    void clear(MouseEvent event) {
        txtId.clear();
        txtName.clear();
        txtDuration.clear();
        txtFee.clear();
    }

    @FXML
    void submit(MouseEvent event) {
        /*Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Program program = new Program();
        program.setProgramId(txtId.getText());
        program.setName(txtName.getText());
        program.setDuration(txtDuration.getText());
        program.setFee(Double.parseDouble(txtFee.getText()));
        session.save(program);
        transaction.commit();
        session.close();*/
        String id = txtId.getText();
        String name = txtName.getText();
        String duration = txtDuration.getText();
        double fee = Double.parseDouble(txtFee.getText());

        try {
            if (programBOImpl.add(new ProgramDTO(id, name, duration, fee)));{
                new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure?").showAndWait();
                txtId.setText(null);
                txtName.setText(null);
                txtDuration.setText(null);
                txtFee.setText(null);

            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Try again carefully!").showAndWait();
        }
    }
}
