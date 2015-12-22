package sample;

import java.net.ServerSocket;
import java.net.Socket;


/**
 * Created by User on 12/10/2015.
 */
public class serverMain implements  Runnable{
    private Thread t;
    private ServerSocket ServSock;
    public serverMain(){
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        try {
            ServSock = new ServerSocket(33338);
            while(true) {
                //if (!selectSubjectController.sub.equals("")) {
                    Socket clientSock = ServSock.accept();
                //System.out.println("established");
                    NetworkUtil nc = new NetworkUtil(clientSock);
                    String t=(String)nc.read();
                String t1 = (String) nc.read();
                System.out.println(t);
                System.out.println(t1);
                    //if(selectSubjectController.choice != -1) {
                    readFile r = new readFile();

                    r.openFile(t);
               // System.out.println(loginController.textFileName);
                    r.readFileFromText();
                    r.closeFile();
                    nc.write(r.getques());
                readAnswerForChemistryScript r1 = new readAnswerForChemistryScript();
                r1.openFile(t1);
                r1.readFileFromText();
                r1.closeFile();
                nc.write(r1.chemistryAnswer());
                //System.out.println(r1.chemistryAnswer());

                   // System.out.println(r.getques());
                    //ChemistryQuestionScript.setText(r.getques());
                    //ChemistryQuestionScript.setEditable(false);
                    //ChemistryQuestionScript.setStyle("-fx-background-color: rgba(53,89,119,0.4); -fx-text-fill: green;");

                    //}
                }
            //}
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        serverMain s = new serverMain();
        //readFile r = new readFile();
        //r.openFile();
        //r.readFileFromText();

       // nc.write(r.getques());
       // System.out.println(r.getques());
        //ChemistryQuestionScript.setText(r.getques());
        //ChemistryQuestionScript.setEditable(false);
        //ChemistryQuestionScript.setStyle("-fx-background-color: rgba(53,89,119,0.4); -fx-text-fill: green;");
        //r.closeFile();
        //System.out.println("ghgh");
    }
}
