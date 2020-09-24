
public class Aushilfe extends Mitarbeiter {

	Aushilfe(String name, String vorname, double gehalt, double urlaub) {
		super(name, vorname, gehalt,urlaub);
		
	}
	
	
	double lohn;
	int geleisteteArbeit;
	public void arbeiten(int stunden)
	{
		 
		 geleisteteArbeit += stunden;
	}
	
	public double lohnBerechnen()
	{
		lohn = this.getGehalt() * geleisteteArbeit;
		System.out.println("Du hast diesen Monat "+lohn +"€ verdient.");
		return lohn;
	}

}
