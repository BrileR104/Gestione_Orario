module com.example.gestione_orario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestione_orario to javafx.fxml;
    exports com.example.gestione_orario;
}