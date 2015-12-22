package sample;

import java.io.File;
import java.util.Scanner;

/**
 * Created by User on 12/5/2015.
 */
public class readAnswerForChemistryScript {
    private Scanner a;
    // private ArrayList<String> chemistryQues = new ArrayList<>();
    private String messageBox = "";
    char [] answer = new char[40];
    int [] intAnswer = new int[40];
    public  void openFile(String s){
        try {
            a = new Scanner(new File(s));
            //if(loginController.selectClass == 1 &&selectSubjectController.choice == 2)a = new Scanner(new File("SSCChemistryAnswerScript1.txt"));
            //if(loginController.selectClass == 1 && selectSubjectController.choice == 1)a = new Scanner(new File("SSCPhysicsAnswerScript1.txt"));
            //if(loginController.selectClass == 1 && selectSubjectController.choice == 3)a = new Scanner(new File("SSCMathAnswerScript1.txt"));
            //if(loginController.selectClass == 1 && selectSubjectController.choice == 4)a = new Scanner(new File("HSCHmathAnswerScript1.txt"));
            //if(loginController.selectClass == 2 &&selectSubjectController.choice == 2)a = new Scanner(new File("HSCChemistryAnswerScript1.txt"));
            //if(loginController.selectClass == 2 && selectSubjectController.choice == 1)a = new Scanner(new File("HSCPhysicsAnswerScript1.txt"));
            //if(loginController.selectClass == 2 && selectSubjectController.choice == 3)a = new Scanner(new File("HSCMathAnswerScript1.txt"));
            //if(loginController.selectClass == 2 && selectSubjectController.choice == 4)a = new Scanner(new File("SSCHmathAnswerScript1.txt"));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void readFileFromText(){
        try {
            while(a.hasNext() != equals(null)){
                String x = a.next();
               // messageBox = messageBox + " " +  x;
                answer = x.toCharArray();
                //messageBox = messageBox + "\n";
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println();
    }
    public void closeFile(){
        try{
            a.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public String getques(){
        return messageBox;
    }
    public int [] chemistryAnswer(){
        for(int i = 0; i < 40; i++){
            int a =  answer[i] -96;
           // int a = (int) answer[i];
            intAnswer[i] = a;
        }
        return intAnswer;
    }

}



