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
        String username = user.getText();
        String password = pw.getText();
        //User u = HelloApplication.knownUsers.stream().findFirst(e -> e.equals(username,password)).orElse(null);
        if (HelloApplication.knownUsers.stream().anyMatch(e -> e.equals(username,password))) {
            assert true;
        } else error();
    }

    private void error() {
    }
}