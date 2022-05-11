package com.example.gestione_orario;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

import java.util.ArrayList;

public class HelloController {
    public TextField user;
    public PasswordField pw;
    public Button enter;
    public ArrayList<User> users;

    public void initialize(){
        user.setOnKeyReleased(key -> {
            if(key.getCode().equals(KeyCode.ENTER)) pw.requestFocus();
        });
        pw.setOnKeyReleased(key -> {
            if(key.getCode().equals(KeyCode.ENTER)) login();
        });
        enter.setOnMouseClicked(e -> login());
    }

    private void login() {
        if (user.getText().isBlank() || pw.getText().isBlank()) {
            error();
            return;
        }
        String userName = user.getText();
        String passWord = pw.getText();
    }

    private void error() {
    }
}