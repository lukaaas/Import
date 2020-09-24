
public class Main {
	public static void main (String []args)
	{
		Mitarbeiter mitarb1 = new Mitarbeiter("Walser","Frank",1600,26);
		Mitarbeiter mitarb2 = new Mitarbeiter("Flink","Eva",1650,26);
		Mitarbeiter chef = new Mitarbeiter("Boss","Hans",3500,26);
		Azubi azubi1 = new Azubi("Vogel","Sven",450,26);
		Aushilfe aushilfe1 = new Aushilfe("Schmidt","Fritz",9.5,26);
		Aushilfe aushilfe2 = new Aushilfe("Engel","Meike",11,26);
		
		System.out.println("Mitarbeiter der TrinkWas GmbH");
		System.out.println("----------------------------------");
		System.out.println("Mitarbeiter "+mitarb1.getVorname()+" "+mitarb1.getName()+" "+mitarb1.getGehalt());
		System.out.println("Mitarbeiter "+mitarb2.getVorname()+" "+mitarb2.getName()+" "+mitarb2.getGehalt());
		System.out.println("Mitarbeiter "+chef.getVorname()+" "+chef.getName()+" "+chef.getGehalt());
		System.out.println("Auszubildender "+azubi1.getVorname()+" "+azubi1.getName()+" "+azubi1.getGehalt());
		System.out.println("");
		chef.gehaltErhoehen(1000);
		
		mitarb1.urlaubNehmen(14);
		mitarb1.urlaubNehmen(14);
		mitarb1.urlaubNehmen(3);
		azubi1.urlaubNehmen(2);
		aushilfe1.arbeiten(5);
		aushilfe1.arbeiten(7);
		aushilfe2.arbeiten(6);
		aushilfe2.arbeiten(6);
		aushilfe2.arbeiten(6);
		aushilfe1.lohnBerechnen();
		aushilfe2.lohnBerechnen();
		
	}
}
