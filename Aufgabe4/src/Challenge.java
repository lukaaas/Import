
public class Challenge 
{
	public static void main(String[]args)
	{
		int[][] schublade = new int [2][2];
		int schubladenFach = 4;
		int userInput;
		int anzahlInput;
		int anzahlGesamt = 0;
		char weiterSpielen = 'y';
		
		
		
		do
		{
			System.out.println("In welcher Schublade möchten Sie arbeiten ? ");
			userInput = io.read_int();
			
		switch(schubladenFach)
		{
		case 1: 
			
				System.out.println("Geben Sie die Anzahl ein:");
				schublade[0][0] = io.read_int();
				break;
			
		case 2:
			
				System.out.println("Geben Sie  die Anzahl ein: ");
				schublade[0][1] = io.read_int();
				break;
			
		case 3:
			
				System.out.println("Geben Sie die Anzahl ein:");
				schublade[1][0] = io.read_int();
				break;
			
		case 4:
			
				System.out.println("Geben Sie die Anzahl ein:");
				schublade[1][1] = io.read_int();
				break;
					
			
			default :
			
				System.out.println("Ihr Schrank hat nur 4 Schubladen.");
				break;
			
		}
		System.out.println("Möchten Sie weiter machen ? ");
		weiterSpielen = io.read_char();
		
		anzahlGesamt += schublade[0][0] + schublade[0][1] + schublade[1][0] + schublade[1][1];
		System.out.println("Die gesamt Anzahl beläuft sich auf : "+anzahlGesamt+" Schuhe.");
	}
		
		while(weiterSpielen == 'y');
}}
