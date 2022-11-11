module com.cleanlandapi.cleanland_api {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.cleanlandapi.cleanland_api to javafx.fxml;
    exports com.cleanlandapi.cleanland_api;
}