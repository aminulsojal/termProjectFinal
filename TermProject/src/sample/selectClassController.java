package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;


public class selectClassController {
    logInMain main;
    public static String adminQuestionTextFileName;
    public static String adminAnswerTextFileName;
    public static int selectClass;
    @FXML
    void ssc(ActionEvent actionEvent) {
        try {
            selectClass = 1;
            adminQuestionTextFileName = "SSC";
            adminAnswerTextFileName = "SSC";
            main.showSubjectPage();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void hsc(ActionEvent actionEvent) {

    }
    public void setMain(logInMain main){
        this.main = main;
    }

    public void hscOnAction(ActionEvent actionEvent) throws IOException {
        selectClass = 2;
        adminQuestionTextFileName = "HSC";
        adminAnswerTextFileName = "HSC";
        main.showSubjectPage();
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        loginController.adminIndicator = 0;
        main.showLogInPage();
    }
}
