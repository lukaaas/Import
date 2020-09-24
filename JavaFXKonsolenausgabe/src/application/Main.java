package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			
			Label lb = new Label("Gebe den Text ein");
			TextArea tf = new TextArea();
			Button senden = new Button("Senden");
			Button ende = new Button("Ende");
			Button loeschen = new Button("Löschen");
			Label ausgabe = new Label("Ausgabe");
			TextArea tf2 = new TextArea();
			
			VBox text = new VBox();
			HBox buttons = new HBox(10);
			buttons.getChildren().addAll(senden,loeschen,ende);
			text.getChildren().addAll(lb,tf,ausgabe,tf2);
			
			senden.setOnAction(e ->{
				tf2.setText(tf.getText());
				
			});
			ende.setOnAction(e ->{
				Platform.exit();
			});
			
			loeschen.setOnAction(e ->{
				tf.clear();
			});
			
			root.add(text, 0, 1);
			root.add(buttons, 0, 2);
			
			
			Scene scene = new Scene(root,500,450);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ausgabe im Feld");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
