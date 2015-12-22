package sample;

/**
 * Created by User on 11/28/2015.
 */
import java.io.File;
import java.util.Scanner;


public class readFile {
    private Scanner a;
   // private ArrayList<String> chemistryQues = new ArrayList<>();
    private String messageBox = "";
  //  private String ans ;

    //public static String sub ;
    public  void openFile(String s){
       // examStartController examStartController1=new examStartController();
        //System.out.println(loginController.textFileName);
        try {
            //selectSubjectController c = new selectSubjectController();
            //String s = c.getTextFileName();
           //if(serverMain.kochu == 1) a = new Scanner((new File((s))));
            //String s = "SSCPhysicsQuestion1.txt";
          //  ans = loginController.textFileName;
            a = new Scanner(new File(s));
           // System.out.println(loginController.textFileName);
           //System.out.println(examStartController1.getTextFileName());
           // a = new Scanner(new File("SSCChemistryQuestion1.txt"));
            //if(loginController.selectClass == 1 && selectSubjectController.choice == 2)a = new Scanner(new File("SSCChemistryQuestion1.txt"));
            //if(loginController.selectClass == 1 && selectSubjectController.choice == 1)a = new Scanner(new File("SSCPhysicsQuestion1.txt"));
            //if(loginController.selectClass == 1 && selectSubjectController.choice == 3)a = new Scanner(new File("SSCMathQuestion1.txt"));
            //if(loginController.selectClass == 1 && selectSubjectController.choice == 4)a = new Scanner(new File("SSCHmathQuestion1.txt"));
            //if(loginController.selectClass == 2 && selectSubjectController.choice == 2)a = new Scanner(new File("HSCChemistryQuestion1.txt"));
            //if(loginController.selectClass == 2 && selectSubjectController.choice == 1)a = new Scanner(new File("HSCPhysicsQuestion1.txt"));
            //if(loginController.selectClass == 2 && selectSubjectController.choice == 3)a = new Scanner(new File("HSCMathQuestion1.txt"));
            //if(loginController.selectClass == 2 && selectSubjectController.choice == 4)a = new Scanner(new File("HSCHmathQuestion1.txt"));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void readFileFromText(){
        try {
            while(a.hasNextLine() != equals(null)){
                String x = a.nextLine();
                messageBox = messageBox + " " +  x;
                messageBox = messageBox + "\n";
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

}

