module com.example.java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java1 to javafx.fxml;
    exports com.example.java1;
}