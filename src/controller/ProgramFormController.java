package controller;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/16/2021
 */

import Entity.Program;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
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



    @FXML
    void clear(MouseEvent event) {
        txtId.clear();
        txtName.clear();
        txtDuration.clear();
        txtFee.clear();
    }

    @FXML
    void submit(MouseEvent event) {
        Session session = FactoryConfiguration.session.getSession();

        Transaction transaction = session.beginTransaction();


        Program program = new Program();

        program.setProgramId(txtId.getText());
        program.setName(txtName.getText());
        program.setDuration(txtDuration.getText());
        program.setFee(Double.parseDouble(txtFee.getText()));

        session.save(program);

        transaction.commit();

        session.close();
    }
}
