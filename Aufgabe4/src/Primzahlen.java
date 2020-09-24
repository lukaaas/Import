public class Primzahlen {


	public static void main(String[] args) {
	
		int eingabe = 0;
		long limit = 100;
		int div;
		int zaehler;
		
	
		
		for(eingabe = 0; eingabe <= limit; eingabe++)
		{
			if(eingabe != 1)
			{
				div = 0;
				
				for(zaehler = 1; zaehler <= eingabe; zaehler++)
				{
					if(eingabe % zaehler == 0)
					{
						div++;
					}
				}
				if(div==2)
				{
					System.out.println(eingabe +" ist eine Primzahl.");
				}
			}
		}
	}

}
