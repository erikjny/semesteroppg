module semesteroppgave {
    requires javafx.controls;
    requires javafx.fxml;

    opens semesteroppgave to javafx.fxml;
    opens semesteroppgave.GUI to javafx.fxml;
    exports semesteroppgave;
}