package application;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.TextField;

public class AdressBuch extends Main{
	
	//Array Liste wird erstellt
	public static List<String> adressListe = new ArrayList<String>();	
	
	
	public static void addAdresse(TextField tf, TextField tf1, TextField tf2, TextField tf3) 
	{
		adressListe.add(tf.getText());
		adressListe.add(tf1.getText());
		adressListe.add(tf2.getText());
		adressListe.add(tf3.getText());
		
		
		//test 123
	}	
	
	public static void printAll() 
	{
		for(String k : adressListe)
		{
			System.out.println(k);
			
		}
		
	}
	
	public static void loeschen()
	{
		adressListe.clear();
	}
	
}
