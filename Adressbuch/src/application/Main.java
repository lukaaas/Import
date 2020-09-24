package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			
			//Ueberschrift neuer Kontakt
			Label lb = new Label("Neuer Kontakt");
			
			//Erstellen der Labels
			Label vorname = new Label("Vorname");
			Label nachname = new Label("Nachname");
			Label telefon = new Label("Telefon");
			Label email = new Label("e-Mail");
			
			
			//Erstellen der TextFelder
			TextField tf  = new TextField();
			TextField tf1 = new TextField();
			TextField tf2 = new TextField();
			TextField tf3 = new TextField();
			
			//Die Buttons werden bekommen im Fenster einen Platz
			root.add(lb, 1, 0);
			root.add(vorname, 0, 2);
			root.add(nachname, 0, 3);
			root.add(telefon, 0, 4);
			root.add(email, 0, 5);		
			root.add(tf, 1, 2);		
			root.add(tf1, 1, 3);
			root.add(tf2, 1, 4);
			root.add(tf3, 1, 5);
			
			HBox bt = new HBox(10);
			
			//Buttons werden erstellt
			Button hinzu = new Button("Hinzufügen");
			Button ausdruck = new Button("Ausdruck");
			Button close = new Button("Schließen");
			Button loeschen = new Button("Loeschen");
			
			//Alle Buttons werden hinzugefügt
			bt.getChildren().addAll(hinzu,ausdruck,loeschen,close);
			root.add(bt, 1, 6);
			
			
	
			//Ausführung der Buttons
			hinzu.setOnAction(e -> {
				AdressBuch.addAdresse(tf, tf1,tf2,tf3);
			});
			
			ausdruck.setOnAction(e -> {
				AdressBuch.printAll();
				
			});
			
			close.setOnAction(e -> {
				Platform.exit();
			});
			
			loeschen.setOnAction(e -> {
				AdressBuch.loeschen();
			});
			
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Kontakte");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
