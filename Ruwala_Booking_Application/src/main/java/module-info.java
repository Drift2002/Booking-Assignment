module org.example.ruwala_booking_application {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ruwala_booking_application to javafx.fxml;
    exports org.example.ruwala_booking_application;
}