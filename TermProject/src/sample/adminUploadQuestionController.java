package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Created by User on 12/16/2015.
 */
public class adminUploadQuestionController {
    @FXML public TextField setNumber;
    @FXML public TextArea uploadQuestion;
    @FXML public TextField setAnswer;
    private logInMain main;

    @FXML public void uploadOnAction(ActionEvent actionEvent) throws IOException {
        selectClassController.adminQuestionTextFileName = selectClassController.adminQuestionTextFileName + setNumber.getText();
        byte data4[] = uploadQuestion.getText().getBytes();
        String s2 = "./" + selectClassController.adminQuestionTextFileName+".txt";

        Path p = Paths.get(s2);

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {

            out.write(data4,0,data4.length);

        } catch (IOException x) {
            System.err.println(x);
        }
        selectClassController.adminAnswerTextFileName = selectClassController.adminAnswerTextFileName + setNumber.getText();
        byte data5[] = setAnswer.getText().getBytes();
        String s5 = "./" + selectClassController.adminAnswerTextFileName+".txt";

        Path p1 = Paths.get(s5);

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p1, CREATE, APPEND))) {

            out.write(data5,0,data5.length);

        } catch (IOException x) {
            System.err.println(x);
        }
        main.showClassPage();
        selectClassController.adminQuestionTextFileName = "";
        selectClassController.adminAnswerTextFileName = "";
    }
    void setMain(logInMain main)
    {
        this.main = main;
    }
}
