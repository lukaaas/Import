import java.util.Scanner;

public class Main {

	public static void main (String []args)
	{
		Scanner scan = new Scanner(System.in);
		
		int note;
		
		System.out.println("Geben Sie Ihre Note als Zahl ein.");
		note = scan.nextInt();
		
		switch (note)
		{
		case 1:
			System.out.println("Ihre Note lautet sehr gut! :)");
			break;
			
		case 2:
			System.out.println("Ihre Note lautete gut! :)");
			break;
			
		case 3:
			System.out.println("Ihre Note lautet befriedigend! :/");
			break;
			
		case 4:
			System.out.println("Ihre Note lautet ausreichend !:(");
			break;
			
		case 5:
			System.out.println("Ihre Note lautet mangelhaft ! :((");
			break;
			
		case 6:
			System.out.println("Ihre Note lautet ungenügend ! :((");
			break;
			
			default:
				System.out.println("Geben Sie eine Note von 1 - 6 ein.");
		}
	}
	
}

