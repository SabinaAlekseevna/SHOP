module com.example.shop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires mysql.connector.java;


    opens com.example.shop to javafx.fxml;
    exports com.example.shop;
    exports MySQL;
    opens MySQL to javafx.fxml;
}