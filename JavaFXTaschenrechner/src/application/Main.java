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
			
			//Erstellen von H und V Box
			
			VBox top = new VBox();			
			HBox bot = new HBox();
			
			bot.setSpacing(10);
			
			Label lb1 = new Label("Zahl1");
			TextField tf1 = new TextField();
			
			Label lb2 = new Label("Zahl2");			
			TextField tf2 = new TextField();
			
			Label lb3 = new Label("Ergbenis");
			TextField tf3 = new TextField();
			top.getChildren().addAll(lb1,tf1,lb2,tf2,lb3, tf3);
			
			//Erstellen der Buttons
			Button plus = new Button("+");
			Button minus = new Button("-");
			Button teilen = new Button("/");
			Button mal = new Button("*");
			Button del = new Button("C");
			Button close = new Button("Beenden");
			
			bot.getChildren().addAll(plus,minus,teilen,mal,del,close);			
			
			//EventHandler für die Buttons
			plus.setOnAction (e->{
				double firstNumber = Double.parseDouble(tf1.getText());
				double secondNumber= Double.parseDouble(tf2.getText());
				tf3.setText(""+(firstNumber + secondNumber));
			});
			minus.setOnAction(e ->{
				double firstNumber = Double.parseDouble(tf1.getText());
				double secondNumber= Double.parseDouble(tf2.getText());
				tf3.setText(""+(firstNumber - secondNumber));
			});
			teilen.setOnAction(e ->{
				double firstNumber = Double.parseDouble(tf1.getText());
				double secondNumber= Double.parseDouble(tf2.getText());
				tf3.setText(""+firstNumber / secondNumber);
			});
			mal.setOnAction(e ->{
				double firstNumber = Double.parseDouble(tf1.getText());
				double secondNumber= Double.parseDouble(tf2.getText());
				tf3.setText(""+firstNumber * secondNumber);
			});
			del.setOnAction(e ->{
				tf1.clear();
				tf2.clear();
				tf3.clear();
			});
			
			close.setOnAction(e ->{
				Platform.exit();
			});
			
			root.add(top, 2, 1);
			root.add(bot, 2,2);
			
			Scene scene = new Scene(root,280,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Taschenrechner");
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
