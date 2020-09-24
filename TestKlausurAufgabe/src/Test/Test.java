package Test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
			int grundbetrag;
			double zinssatz;
			int jahre;
			
			
			
			Scanner eingabe = new Scanner(System.in);
			
			System.out.println("Bitte geben Sie den Grundbetrag ein:");
			grundbetrag = eingabe.nextInt();
			
			System.out.println("Bitte geben Sie die zinssatz ein: ");
			zinssatz = eingabe.nextDouble();
			
			System.out.println("Bitte geben Sie die Jahre ein:");
			jahre = eingabe.nextInt();
			
			System.out.println("Ihr Vermögen nach "+jahre +" : "+" Jahr/e: "+rechnen(grundbetrag, zinssatz,jahre) +"€.");
			
	}
	
			static double rechnen (int grundbetrag, double zinssatz, int jahre)
			{
				
				double endbetrag;
				endbetrag = grundbetrag*(Math.pow((1+zinssatz/100),jahre));
				
				return endbetrag;

			}
	

}
