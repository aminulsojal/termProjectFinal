package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

/**
 * Created by User on 11/25/2015.
 */
public class selectSubjectController {
    public Button physics;
    public Button math;
    public Button hmath;
    public Button profile;
    logInMain main;
    public static int choice;
    private static String sub;
    //readFile r = new readFile();
    //chemistryScriptController che = new chemistryScriptController();


    public void chemistry(ActionEvent actionEvent) throws IOException {
        if(loginController.adminIndicator == 1){
            //selectClassController.adminQuestionTextFileName = selectClassController.adminQuestionTextFileName + "ChemsitryQuestion";
            //selectClassController.adminAnswerTextFileName = selectClassController.adminAnswerTextFileName + "ChemsitryAnswerScript";
            selectClassController.adminQuestionTextFileName = selectClassController.adminQuestionTextFileName + "ChemistryQuestion";
            selectClassController.adminAnswerTextFileName = selectClassController.adminAnswerTextFileName + "ChemistryAnswerScript";

            main.showAdminQuestionUploadPage();


        }
        else {
            choice = 2;
            //if (loginController.selectClass == 1) sub = "SSCChemistryQuestion1.txt";
            //else if (loginController.selectClass == 2) sub = "HSCChemistryQuestion1.txt";
            //main.showChemistryQues();
//        che.getChemistryQuestionScript();
           loginController.textFileName = loginController.textFileName + "ChemistryQuestion";
            //System.out.println(loginController.textFileName);
            loginController.textAnswerFileName = loginController.textAnswerFileName +"ChemistryAnswerScript";
            //loginController.textFileName = loginController.textFileName+".1txt";
            //loginController.textAnswerFileName = loginController.textAnswerFileName + ".1txt";
            main.showStartExamPage();
        }

    }
    public void setMain(logInMain main){
        this.main = main;
    }

    public void physicsOnAction(ActionEvent actionEvent) throws IOException {
        if(loginController.adminIndicator == 1){
            selectClassController.adminQuestionTextFileName = selectClassController.adminQuestionTextFileName + "PhysicsQuestion";
            selectClassController.adminAnswerTextFileName = selectClassController.adminAnswerTextFileName + "PhysicsAnswerScript";
            main.showAdminQuestionUploadPage();
        }
        else {
            choice = 1;
            loginController.textFileName = loginController.textFileName + "PhysicsQuestion";
            //loginController.textFileName = loginController.textFileName + "ChemsitryQuestion";
            loginController.textAnswerFileName = loginController.textAnswerFileName +"PhysicsAnswerScript";
            //loginController.textFileName = loginController.textFileName + "1"+".txt";
             //loginController.textAnswerFileName = loginController.textAnswerFileName + "1"+".txt";
            // main.showChemistryQues();
            main.showStartExamPage();
        }
    }


    public void mathOnAction(ActionEvent actionEvent) throws IOException {
        if(loginController.adminIndicator == 1){
            selectClassController.adminQuestionTextFileName = selectClassController.adminQuestionTextFileName + "MathQuestion";
            selectClassController.adminAnswerTextFileName = selectClassController.adminAnswerTextFileName + "MathAnswerScript";
            main.showAdminQuestionUploadPage();
        }
        else {
            choice = 3;
           // if (loginController.selectClass == 1) sub = "SSCMathQuestion1.txt";
            //else if (loginController.selectClass == 2) sub = "HSCMathQuestion1.txt";
            loginController.textFileName = loginController.textFileName + "MathQuestion";
            loginController.textAnswerFileName = loginController.textAnswerFileName +"MathAnswerScript";
            //main.showChemistryQues();
            main.showStartExamPage();
        }
    }

    public void hmathOnAction(ActionEvent actionEvent) throws IOException {
        if(loginController.adminIndicator == 1){
            selectClassController.adminQuestionTextFileName = selectClassController.adminQuestionTextFileName + "HmathQuestion";
            selectClassController.adminAnswerTextFileName = selectClassController.adminAnswerTextFileName + "HmathAnswerScript";
            main.showAdminQuestionUploadPage();
        }
        else {
            choice = 4;
            //if (loginController.selectClass == 1) sub = "SSCHmathQuestion1.txt";
            //else if (loginController.selectClass == 2) sub = "HSCHmathQuestion1.txt";
            // main.showChemistryQues();
            loginController.textFileName = loginController.textFileName + "HmathQuestion";
            loginController.textAnswerFileName = loginController.textAnswerFileName +"HmathAnswerScript";
            main.showStartExamPage();
        }
    }

    public void profileOnAction(ActionEvent actionEvent) throws IOException {
        main.profileDetails();
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        main.showLogInPage();
    }
    public String getTextFileName()
    {
        return sub;
    }
}
