package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
		
			ObservableList<String> items = FXCollections.observableArrayList("Meer","Berg","See","Urlaub","Sonne");
			ListView<String> list = new ListView<>();
			list.setItems(items);
			list.setPrefHeight(75);
			list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
			
			
			
			
			root.getChildren().add(list);
			
			Scene scene = new Scene(root,400,400);			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		
		launch(args);
		
	}
}
