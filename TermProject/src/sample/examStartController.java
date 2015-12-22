package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * Created by User on 12/10/2015.
 */
public class examStartController {
    public TextField setNumber;
    private logInMain main;
    private String serverAddress  = "127.0.0.1";
    private int serverPort = 33338;
    public static String set = "";
    //private String temp="";
   // private chemistryScriptController cs;

    public void startOnAction(ActionEvent actionEvent) throws IOException {
        loginController.textFileName = loginController.textFileName + setNumber.getText()+".txt";
        loginController.textAnswerFileName = loginController.textAnswerFileName + setNumber.getText()+".txt";
        set = setNumber.getText();
        //System.out.println(loginController.textFileName);
       // temp=loginController.textFileName;
        NetworkUtil nc = new NetworkUtil(serverAddress,serverPort);
        nc.write(loginController.textFileName);
        nc.write(loginController.textAnswerFileName);
        chemistryScriptController sc = new chemistryScriptController();
       String s = (String) nc.read();
          int [] s1 = (int [] )nc.read();

     sc.setClientQuestion(s,s1);


        //System.out.println(s);
        //chemistryScriptController sc = new chemistryScriptController();
        //sc.setChemistryQuestionScript();


//        cs.setChemistryQuestionScript();
        main.showChemistryQues();


        // chemistryScriptController c = new chemistryScriptController();
        //c.setChemistryQuestionScript();

    }
    //public void setchemistryScriptController(chemistryScriptController cs1)
    //{
      //  cs=cs1;
    //}

    public void setMain(logInMain main){
        this.main = main;
    }
}
