package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class logInMain extends Application {
    Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        showLogInPage();
    }
    public void showLogInPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        //Image image1 = new Image("E:\\TermProject\\cover.png", true);
        //image1.isBackgroundLoading();
        Parent root = loader.load();
        loginController loginController1 = loader.getController();
        loginController1.setMain(this);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/color.css");
//        scene.getStylesheets().add(getClass().getResource("sample/color.css").toExternalForm());
        stage.setScene(scene);
        //stage.setFullScreen(true);
        stage.setTitle("SIGN UP");
        stage.show();
    }
    public void showSignUpPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("signUp.fxml"));
        Parent root = loader.load();
        signUpcontroller loginController1 = loader.getController();
        loginController1.setMain(this);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/SignUp.css");

        //scene.getStylesheets().add(logInMain.class.getResource("color.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Sign Up");
        stage.show();
    }
    public void profileDetails() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("profile.fxml"));
        Parent root = loader.load();
        profileController loginController1 = loader.getController();
        loginController1.setMain(this);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/Profile.css");
        //scene.getStylesheets().add(logInMain.class.getResource("color.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle(loginController.s1);
        stage.show();
    }
    public void showClassPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("selectClass.fxml"));
        Parent root = loader.load();
        selectClassController loginController1 = loader.getController();
        loginController1.setMain(this);
        Scene scene = new Scene(root);

        scene.getStylesheets().add("sample/SelectClass.css");
        //scene.getStylesheets().add("E:\\TermProject\\color.css");
        //scene.getStylesheets().add(logInMain.class.getResource("color.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Select Class");
        stage.show();
    }

    public void showSubjectPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("selectSubject.fxml"));
        Parent root = loader.load();
        selectSubjectController loginController1 = loader.getController();
        loginController1.setMain(this);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/SelectSubject.css");
        //scene.getStylesheets().add("E:\\TermProject\\color.css");
        //scene.getStylesheets().add(logInMain.class.getResource("color.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Select Subject");
        stage.show();
    }

    public void showAdminQuestionUploadPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("adminUploadQuestion.fxml"));
        Parent root = loader.load();
        adminUploadQuestionController loginController1 = loader.getController();
        loginController1.setMain(this);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/UploadQuestion.css");
        //scene.getStylesheets().add("E:\\TermProject\\color.css");
        //scene.getStylesheets().add(logInMain.class.getResource("color.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Set Question and answer");
        stage.show();
    }


    public void showChemistryQues() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("chemistryScript.fxml"));
        //Image image1 = new Image("E:\\TermProject\\cover.png", true);
        //image1.isBackgroundLoading();
        Parent root = loader.load();
        chemistryScriptController loginController1 = loader.getController();
        //examStartController temp=new examStartController();
        //temp.setchemistryScriptController(loginController1);
       //loginController1.setChemistryQuestionScript(chemistryScriptController.clientQuestion);
        loginController1.setChemistryQuestionScript();
        loginController1.setAnswerScript();
        loginController1.timeSet();
        loginController1.setMain(this);
        Scene scene = new Scene(root);
        //scene.getStylesheets().add("sample/color.css");
        // scene.getStylesheets().add("sample/color.css");
        //scene.getStylesheets().add(getClass().getResource("E:\\TermProject\\color.css").toExternalForm());
        root.setStyle("-fx-background-color:#96e3f4; -fx-text-fill: #96e3f4;");;
        stage.setScene(scene);
        stage.setTitle("Question");
        //stage.setMaximized(true);

        stage.show();
    }
    public void showChemistryResult() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("chemistryShowResult.fxml"));
        Parent root = loader.load();
        chemistryShowResultController loginController1 = loader.getController();
        loginController1.setMain(this);
        //chemistryScriptController t = new chemistryScriptController();
        //String s = "" + t.showMarks();
        //showAnswer.setText(s);
        //loginController1.showAnswer.setText(s);
        Scene scene = new Scene(root);
       // root.setStyle("-fx-background-image:answerPage.jpg");
        //scene.getStylesheets().add("E:\\TermProject\\color.css");
        //scene.getStylesheets().add(logInMain.class.getResource("color.css").toExternalForm());
        scene.getStylesheets().add("sample/ShowResult.css");
        stage.setScene(scene);
        stage.setTitle("Result");
        stage.show();
    }
    public void showStartExamPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("examStart.fxml"));
        Parent root = loader.load();
        examStartController loginController1 = loader.getController();
        loginController1.setMain(this);
        //chemistryScriptController t = new chemistryScriptController();
        //String s = "" + t.showMarks();
        //showAnswer.setText(s);
        //loginController1.showAnswer.setText(s);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/StartExam.css");
        //scene.getStylesheets().add("E:\\TermProject\\color.css");
        //scene.getStylesheets().add(logInMain.class.getResource("color.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Result");
        stage.show();
    }


    public static void main(String[] args) {
        //serverMain s = new serverMain();
        launch(args);
    }
}
