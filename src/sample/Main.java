package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage myStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        myStage.setTitle("Calculator");

        myStage.setScene(new Scene(root, 390, 690));
        myStage.setResizable(false);

        myStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
