import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int z1;
		int z2;
		char z3;
		double ergebnis;
		
		System.out.println("Gebe die erste Zahl ein: ");
		z1 = scan.nextInt();
		
		System.out.println("Geben die zweite Zahl ein: ");
		z2 = scan.nextInt();
		
		System.out.println("Gebe den Parameter ein: ");
		z3 = io.read_char();
		
		System.out.println(z3);
		
		if(z3 == '+')
		{
			ergebnis = z1 + z2;
			System.out.println(ergebnis);
		}
		else if(z3 == '-')
		{
			ergebnis = z1 - z2;
			System.out.println(ergebnis);
		}
		else if(z3 == '*')
		{
			ergebnis = z1 * z2;
			System.out.println(ergebnis);
		}
		else if(z3 == '/')
		{
			ergebnis = z1 / z2;
			System.out.println(ergebnis);
		}

	}

}
