package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			
			VBox vb1 = new VBox();
			
			Label lb1 = new Label("Test");
			TextField tf1 = new TextField("Test");
			HBox bot = new HBox();
			
			Button del = new Button("C");
			Button close = new Button("finish");
			bot.getChildren().addAll(del,close);
			
			del.setOnAction(e ->
				tf1.clear()
					);
			
			close.setOnAction(e ->
				Platform.exit()			
					);
			
			vb1.getChildren().addAll(lb1,tf1);
			root.add(vb1, 2, 1);
			root.add(bot, 2, 2);
			
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
