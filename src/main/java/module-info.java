module com.example.dbdemo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dbdemo1 to javafx.fxml;
    exports com.example.dbdemo1;
}