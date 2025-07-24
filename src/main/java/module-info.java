module com.vojtech.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires atlantafx.base;

    opens com.vojtech.javafx to javafx.fxml;
    exports com.vojtech.javafx;
    exports com.vojtech.javafx.controller;
    opens com.vojtech.javafx.controller to javafx.fxml;
}
