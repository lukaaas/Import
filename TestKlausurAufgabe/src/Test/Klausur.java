package Test;

public class Klausur {
	public static void main(String[]args)
	{
		System.out.println(summe(7));
		
	}
	
	static int summe(int n)
	{
		int ergebnis = 0;
		for(int i = 0; i<=n; i++)
		{
			ergebnis += i;
		}
		return ergebnis;
	}

}
