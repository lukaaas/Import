
public class Terminkalender 
{
	public static int eingabe (int untergrenze, int obergrenze)
	{
		/* Funktion um die Eingabe einer Ganzzahl zu ermöglichen, die zwischen 2 Werten liegt
		 * untergrenze = kleinster Wert, der eingegeben werden darf
		 * obergrenze = größter Wert, der eingegeben werden darf
		 */
		
		// Deklaration der Variable rueckgabewert als int
		int rueckgabewert;
		
		do
		{
			rueckgabewert = io.read_int();
			if (rueckgabewert < untergrenze | rueckgabewert > obergrenze)
			{
				System.out.println("Bitte nur Zahlen von " + untergrenze + " bis " + obergrenze + " eingeben!");
			}
		}
		while (rueckgabewert < untergrenze | rueckgabewert > obergrenze);
		
		return rueckgabewert;
	}
	
	public static void termin_eintragen (char [][] terminkalender, int tag)
	{
		// Funktion um in den Terminkalender einen ganztägigen Termin einzutragen
		
		// Hier muss etwas eingetragen werden!!!!!
	}
	
	public static void termin_eintragen (char [][] terminkalender, int tag, int startzeit)
	{
		// Funktion um in den Terminkalender einen Termin mit Tag und Startzeit einzutragen
		
		// Hier muss etwas eingetragen werden!!!!!
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Deklaration und Initialisierung eines zweidimensionalen Feldes zur Aufnahme von int-Werten
		// Die erste Dimension symbolisiert einen Tag im Monat, die zweite eine Uhrzeit am betreffenden Tag
		
		// Hier muss noch etwas eingetragen werden!!!!!
		
		// Deklaration der Variable tag als int
		int tag;
		// Deklaration und Initialisieren der Variable startzeit als int
		int startzeit = 0;
		// Deklaration der Variable startzeit_eingeben als char
		char startzeit_eingeben;
		
		// In den Kalender sollen 5 Termine eingegeben werden		
		for (int termin = 1; termin <= 5; termin++)
		{
			System.out.println("An welchem Tag ist der Termin - bitte als Zahl eingeben, z.B. 4 für den 4. des Monats:");
			tag = eingabe (1,31);
			
			System.out.println("Möchten Sie nun noch eine Startzeit eingeben?");
			System.out.println("j - JA\nn - NEIN");
			//Antwort einlesen und sicherstellen, dass nur "j" oder "n" akzeptiert werden
			do
			{
				startzeit_eingeben = io.read_char();
				if (startzeit_eingeben != 'j' && startzeit_eingeben != 'n')
				{
					System.out.println("Es ist nur die Eingabe von \"j\" bzw. \"n\" möglich!");
				}				
			}
			while (startzeit_eingeben != 'j' && startzeit_eingeben != 'n');
			
			// Abfrage der Startzeit des Termin, sofern eine eingegeben werden soll sowie Eintrag des 
			// Termins in den Kalender (entweder mit Tag und Uhrzeit oder als ganztägiger Termin)
			
			// Hier muss etwas eingetragen werden!!!!!
		}		
		
		// Hier muss etwas eingetragen werden!!!!!
		
		// Ausgabe des Terminkalenders
		
		// Hier muss etwas eingetragen werden!!!!!
	}

}
