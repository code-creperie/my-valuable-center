module org.example.myvaluablecenter {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.myvaluablecenter to javafx.fxml;
    exports org.example.myvaluablecenter.showcase;
    exports org.example.myvaluablecenter.model;
    exports org.example.myvaluablecenter.view;
    exports org.example.myvaluablecenter.main;
    exports org.example.myvaluablecenter.controller;
}