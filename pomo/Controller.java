package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;



import static javafx.animation.Animation.INDEFINITE;

public class Controller {
    @FXML
    private Label lbl, lbl1;

    @FXML private Rectangle first_done,second_done, third_done;
    int seg = 5;
    int min = 25;

    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> handle()));

    public void first_Done(){
        first_done.setVisible(true);
    }

    public void second_Done(){
        second_done.setVisible(true);
    }
    public void third_Done(){
        third_done.setVisible(true);
    }
    public void press() {

    {
            timeline.setCycleCount(INDEFINITE);

            timeline.play();
     }

    }

    public void handle() {
        seg--;

        if(seg==0){
            first_Done();
            timeline.stop();
            seg = 59;
            min--;
        }

        lbl1.setText(Integer.toString(seg));
        lbl.setText(Integer.toString(min));

    }
}

