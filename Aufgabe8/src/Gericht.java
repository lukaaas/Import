
public class Gericht {

	String name;
	double basispreis;
	
	Gericht(String name, double basispreis)
	{
		this.name = name;
		this.basispreis = basispreis;
	}
	
	public double berechnePreis(String groesse)
	{
		double preis = 0;
		switch(groesse)
		{
		case "klein": preis = basispreis/100 * 80;	
		System.out.println("Der Preis beträgt: "+preis);
		break;
		
		case "mittel": preis = basispreis/100 * 100;
		System.out.println("Der Preis beträgt: "+preis);
		break;
		
		case "groß": preis = basispreis/100 * 120;
		System.out.println("Der Preis beträgt: "+preis);
		break;
		
		default: System.out.println("Bitte geben Sie groß, mittel oder klein ein.");
		break;
		}
		
		return preis;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasispreis() {
		return basispreis;
	}
	public void setBasispreis(double basispreis) {
		this.basispreis = basispreis;
	}
	
	
}
