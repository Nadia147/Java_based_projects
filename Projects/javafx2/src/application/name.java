package application;
import javafx.application.Application;
import java.util.Scanner;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class name extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button b=new Button("<Click here>");
		Button b1=new Button("<Click>");
		
		b.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Name: Diya..");}});
				b1.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						System.out.println("Name: Diya..");
						
						
				
				
			}});
			StackPane root2 = new StackPane();
			root2.getChildren().add(b1);
			Scene scene2=new Scene(root2,500,200);
			primaryStage.setScene(scene2);
			primaryStage.show();
			
		
			
	//b.setOnAction(s);
		
		StackPane root = new StackPane();
		root.getChildren().add(b);
		Scene scene=new Scene(root,500,200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

public void start2(Stage primaryStage) throws Exception {
	//Button b=new Button("<Click here>");
	Button b1=new Button("<Click>");
	
	//b.setOnAction(new EventHandler<ActionEvent>() {
		//public void handle(ActionEvent event) {
			//System.out.println("Name: Diya..");}});
			b1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("Name: Diya..");
					
					
			
			
		}});
		StackPane root2 = new StackPane();
		root2.getChildren().add(b1);
		Scene scene2=new Scene(root2,500,200);
		primaryStage.setScene(scene2);
		primaryStage.show();
		
	
		
//b.setOnAction(s);
	
	/*StackPane root = new StackPane();
	root.getChildren().add(b);
	Scene scene=new Scene(root,500,200);
	primaryStage.setScene(scene);
	primaryStage.show();*/
	
	
}
}