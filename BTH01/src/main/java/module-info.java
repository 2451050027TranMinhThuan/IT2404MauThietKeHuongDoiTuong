module com.tmt.bth01 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tmt.bth01 to javafx.fxml;
    exports com.tmt.bth01;
}
