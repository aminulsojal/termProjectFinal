package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Created by User on 12/5/2015.
 */
public class chemistryShowResultController {
    @FXML
    public TextArea showAnswer;
    private logInMain main;
    public void writeToUserFile(){
        // String s = "Name : " + firstName.getText() + " " + lastNmae.getText()+ "; " + "User Name : " + userName.getText() + "; "+
        //       "Password : " + createAPassword.getText() + "; " + "Institution Name : " + instittionName.getText();
        String s = "";
        if(chemistryScriptController.count <= 9) s = s+'0'+chemistryScriptController.count;
        else s = s + chemistryScriptController.count;
        showAnswer.setText(s);
        //writeToUserFile();
        String s11 ="";
        if(selectSubjectController.choice == 1)s11 = "Physics                             ";
        if(selectSubjectController.choice == 2)s11 = "Chemistry                       ";
        if(selectSubjectController.choice == 3)s11 = "Mathematics                 ";
        if(selectSubjectController.choice == 4)s11 = "Higher Mathematics  ";

        s11 = s11 +examStartController.set + "                        " + s ;
        byte data[] = s11.getBytes();
        String s1 = "\n";
        byte data1[] = s1.getBytes();
       // loginController l = new loginController();
        String s2 = "./" + loginController.s1+".txt";
        Path p = Paths.get(s2);

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(data, 0, data.length);
            out.write(data1,0,data1.length);

        } catch (IOException x) {
            System.err.println(x);
        }

    }
    public void setMain(logInMain main) {
        this.main = main;
        writeToUserFile();

    }

    public void gotoMainMenuOnAction(ActionEvent actionEvent) throws IOException {
        main.showSubjectPage();
        //if(profileController.sub == 1)chemistryScriptController.count = 0;
        chemistryScriptController.count = 0;
        if(loginController.k == 0){
            loginController.textFileName = "SSC";
            loginController.textFileName = "SSC";
        }
        if(loginController.k == 1){
            loginController.textFileName = "HSC";
            loginController.textAnswerFileName = "HSC";
        }
    }

    public void profileOnAction(ActionEvent actionEvent) throws IOException {
        main.profileDetails();
        chemistryScriptController.count = 0;
       // loginController.textFileName = "";
        //loginController.textAnswerFileName = "";
        if(loginController.k == 0){
            loginController.textFileName = "SSC";
            loginController.textFileName = "SSC";
        }
        if(loginController.k == 1){
            loginController.textFileName = "HSC";
            loginController.textAnswerFileName = "HSC";
        }

    }
}
