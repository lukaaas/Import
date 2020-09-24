
public class Umrechnungsprogramm 
{
	public static void main(String args[])
	{	
		double durchschnitt;
		double ergebnis = 0;
		double userInput;
		String [] Monat = {"Januar","Februar","März","April","Mai","Juni","Juli","August","September",
				"Oktober","November","Dezember"};
	
		
		for(int i = 0; i< Monat.length;i++)
		{
			
		System.out.println("Geben Sie die Temperatur des "+Monat[i]+" Monats ein.");
		userInput = io.read_double();
		
		ergebnis += userInput;
		
		}
		
		
		durchschnitt = ergebnis / Monat.length;
		System.out.println(durchschnitt);
		
		
	}
	
}
