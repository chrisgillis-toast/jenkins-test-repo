module com.example.chrisgillisjenkinstest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chrisgillisjenkinstest to javafx.fxml;
    exports com.example.chrisgillisjenkinstest;
}