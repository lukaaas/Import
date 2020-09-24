
public class Challenge
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Rennauto BMW = new Rennauto (1, "Klaus", "BMW", "blau", 200);
		Rennauto OPEL = new Rennauto (2, "Peter", "OPEL", "rot", 190);
		Rennauto VW = new Rennauto (3, "Marie", "VW", "grün", 194);
		Rennauto FORD = new Rennauto (4, "Antje", "FORD", "gelb", 186);
		Rennauto AUDI = new Rennauto (5, "Stefan", "AUDI", "weiß", 192);
		
		Rennauto [] teilnehmer = {BMW, OPEL, VW, FORD, AUDI};
		
		Autorennen leMans = new Autorennen (teilnehmer, 1000);		
				
		while (	! leMans.zuEnde () )
		{
			leMans.alleFahren();
		}
		
		Rennauto sieger = leMans.sieger();
		
		System.out.println("Gewonnen hat der " + sieger.getName() + ", gefahren von " + sieger.getFahrer() + "!");
	
		for (Rennauto a : teilnehmer)
			System.out.println(a);
	}

}
