package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.io.IOException;

/**
 * Created by User on 11/28/2015.
 */
public class chemistryScriptController implements  Runnable {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextArea ChemistryQuestionScript;
    private logInMain main;
    public static String clientQuestion = "";
    public static int [] clientAnswer = new int [40];
    @FXML
    TextField timeCounter;
    Thread t;
    String s = "0 : 00";
    public static int off = 0;
    private readFile r = new readFile();
    @FXML
    Button submit;
    @FXML
    private AnchorPane answerScript;
    private MyEventHandler myEventHandler;
    private RadioButton[] buttons = new RadioButton[160];
    private ToggleGroup[] group = new ToggleGroup[40];
    public static int count = 0;
    public void timeSet() {
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int l = 0; l < 40; l++) {
                for (int m = 0; m < 59; m++) {

                    Thread.sleep(1000);

                    if (m <= 9) {
                        s = l + " : 0" + m;
                        //System.out.println(i + " : 0" + j);
                    } else {
                        s = l + " : " + m;
                        //System.out.println(i + " : " + j);
                    }
//                       timeCounter.setText("");
                    timeCounter.setText(s);

                }
            }
            //readAnswerForChemistryScript r = new readAnswerForChemistryScript();
            //r.openFile();
            //r.readFileFromText();
            //r.closeFile();
            //int array[] = r.chemistryAnswer();
            for (int i = 0; i <= 39; i++) {
                int temp = i * 4 + clientAnswer[i]-1;
                if (buttons[temp].isSelected()) count++;
            }
           // System.out.println("hjhjkh");

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            main.showChemistryResult();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        off = 1;

    }
    public void setClientQuestion(String s1,int [] a){
        clientQuestion = s1;
        clientAnswer = a;
        //System.out.println(clientQuestion);
    }

    public void setChemistryQuestionScript() {
       // r.openFile();
        //r.readFileFromText();
       // String s = "jkjkjk";
       // clientQuestion = s1;

        ChemistryQuestionScript.setText(clientQuestion);
       // System.out.println(clientQuestion);
        ChemistryQuestionScript.setEditable(false);
        ChemistryQuestionScript.setStyle("-fx-background-color: rgba(53,89,119,0.4); -fx-text-fill: #3a11d0;");
       // r.closeFile();
      // main.showChemistryQues();
    }
    public void setAnswerScript() {
        myEventHandler = new MyEventHandler();
        Text[] text = new Text[40];
        int k = -1;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new RadioButton();
            buttons[i].setTextFill(Color.BLUE);
            buttons[i].setOnAction(myEventHandler);
            if (i % 4 == 0) {
                k++;
                int p = k + 1;
                group[k] = new ToggleGroup();
                String s1 = "";
                if (k < 9) s1 = "0" + p;
                else s1 = "" + p;
                text[k] = new Text(-15 + (i / 40) * 200, 15 + (i / 4 - (i / 40) * 10) * 20, s1);
                text[k].setFill(Color.BLACK);
                answerScript.getChildren().add(text[k]);
            }
            answerScript.getChildren().add(buttons[i]);
            int j = i % 4;
            if (j == 0) {
                buttons[i].setToggleGroup(group[k]);
                buttons[i].setText("a");
                buttons[i].setLayoutX(0 + (i / 40) * 200);
                buttons[i].setLayoutY((i / 4 - (i / 40) * 10) * 20);
            } else if (j == 1) {
                buttons[i].setToggleGroup(group[k]);
                buttons[i].setText("b");
                buttons[i].setLayoutX(40 + (i / 40) * 200);
                buttons[i].setLayoutY((i / 4 - (i / 40) * 10) * 20);
            } else if (j == 2) {
                buttons[i].setToggleGroup(group[k]);
                buttons[i].setText("c");
                buttons[i].setLayoutX(80 + (i / 40) * 200);
                buttons[i].setLayoutY((i / 4 - (i / 40) * 10) * 20);

            } else if (j == 3) {
                buttons[i].setToggleGroup(group[k]);
                buttons[i].setText("d");
                buttons[i].setLayoutX(120 + (i / 40) * 200);
                buttons[i].setLayoutY((i / 4 - (i / 40) * 10) * 20);

            }
        }
    }

    public void setMain(logInMain main) {
        this.main = main;
    }


    @FXML
    public void submitOnAction(ActionEvent actionEvent) throws IOException {
       /* readAnswerForChemistryScript r = new readAnswerForChemistryScript();
        r.openFile();
        r.readFileFromText();
        r.closeFile();
        int array[] = r.chemistryAnswer();*/

       // for (int i = 0; i <= 39; i++) {
        for(int i = 0; i < clientAnswer.length;i++){
            int temp = i * 4 + clientAnswer[i]-1;
            if (buttons[temp].isSelected()) count++;
        }

        main.showChemistryResult();
        //System.out.println(clientQuestion);
    }
    class MyEventHandler implements EventHandler {
        @Override
        public void handle(Event event) {
            RadioButton b = (RadioButton) event.getSource();
            //System.out.println(b.getText());
        }
    }
}
