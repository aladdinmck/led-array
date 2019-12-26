
import java.io.File;
import java.util.Random;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Timer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import java.util.TimerTask;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.animation.FillTransition;

/**
 * Application class for {@code LedArray}.
 * @version 2020.
 */

public class LedArray extends Application {
    Group group = new Group();
    Text timerText = new Text();
    Timeline t;
    
    /** {@inheritDoc} */
    @Override
    public void start(Stage stage) {
	StackPane stack = new StackPane();
	Rectangle bg = new Rectangle(0, 0, 1255, 705);
	bg.setFill(Color.BLACK);
	stack.getChildren().add(bg);
	group.getChildren().add(stack);
	/*	for (int i = 0; i < 1000/20; i++) {
	    for (int j = 0; j < 560/20; j++) {
		Rectangle rect = new Rectangle ((i * 25) + 5, (j * 25) + 5, 20, 20);
		rect.setFill(Color.web("0x202020"));
		rect.setArcHeight(5);
		rect.setArcWidth(5);
		group.getChildren().add(rect);
	    }
	}
	*/
	// Stage handling:                                                                                  
        Scene scene = new Scene(group, 1255, 705);
        stage.setTitle("cs1302-arcade!");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
	/*
	t = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
			group.setOnKeyPressed(createKeyHandler());
			group.requestFocus();
		    }
		}));
        t.setCycleCount(Timeline.INDEFINITE);
	*/
    }
    /*
    private EventHandler<? super KeyEvent> createKeyHandler() {
	return event -> {
	    if (event.getCode() == KeyCode.SPACE) {
		System.out.println("Space Pressed");
	    }
	};
    }
    */
    

}