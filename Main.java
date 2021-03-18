package pomojava

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Main<INDEFINITE> extends Application
{
public static void main(String[] args)
{
        Application.launch(args);
}
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        stage.setTitle("Pomodoro");
        stage.setScene(new Scene(root, 800, 500));
        stage.show();

    }


