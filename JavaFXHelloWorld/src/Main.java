
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args)
	{
		
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		//Label für die Adresseingabe
		
		Label lbl_vorname = new Label(" Vorname: ");
		Label lbl_nachname = new Label(" Nachname: ");
		Label lbl_strasse = new Label(" Strasse: ");
		Label lbl_ort = new Label(" Ort: ");
		
		//Textfelder für die Adresseingabe
		
		final TextField tf_vorname = new TextField();
		final TextField tf_nachname = new TextField();
		final TextField tf_strasse = new TextField();
		final TextField tf_ort = new TextField();
		
		// Sammeln der Elemente in einem GridPane
		
		GridPane pane = new GridPane();
		pane.add(lbl_vorname, 0, 0);
		pane.add(lbl_nachname, 0, 1);
		pane.add(lbl_strasse, 0, 2);
		pane.add(lbl_ort, 0, 3);
		pane.add(tf_vorname, 1, 0);
		pane.add(tf_nachname, 1, 1);
		pane.add(tf_strasse, 1, 2);
		pane.add(tf_ort, 1, 3);
		
		
		// Erstellen einer Scene und Verknüpfen mit dem GridPane
		BorderPane root = new BorderPane();
		root.setTop(pane);
		Scene scene = new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Adressfenster");
		
		
		//Erstellen einer HBox zum Anordnen der Buttons
		HBox button_box = new HBox();
		
		//Erstellen der Buttons
		Button bOK = new Button("OK");
		Button bEN = new Button("Ende");
		Button bABB = new Button("Löschen");
		// Hier fehlt noch etwas
		button_box.getChildren().addAll(bOK, bEN, bABB);
		
		button_box.setSpacing(10);
		pane.add(button_box, 1, 4);
		//EventHandling für die Buttons
		//Konsolenausgabe der TextFelder
		bOK.setOnAction(e ->{
			System.out.println(tf_vorname.getText());
			System.out.println(tf_nachname.getText());
			System.out.println(tf_strasse.getText());
			System.out.println(tf_ort.getText());
		});
		//Sauberes Beenden der GUI
		bEN.setOnAction(e ->{
			Platform.exit();
		});
		//Textfelder löschen
		bABB.setOnAction(e ->{
			tf_strasse.clear();
			tf_vorname.clear();
			tf_nachname.clear();
			tf_ort.clear();			
			
		});
		
		// Hier fehlt auch noch etwas
		
		primaryStage.show();
		
	}

}
