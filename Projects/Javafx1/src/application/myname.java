package application;
import javafx.application.Application;
import java.util.Scanner;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class myname extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button b=new Button("<Click here>");
		b.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Name: Diya..");
				
				
			}
		}
				);
	//b.setOnAction(s);
		
		StackPane root = new StackPane();
		root.getChildren().add(b);
		Scene scene=new Scene(root,500,200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
}