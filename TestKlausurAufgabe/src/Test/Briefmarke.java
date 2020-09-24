package Test;

public class Briefmarke {

	float nennwert;
	String name;
	int herausgebejahr;
	int anschaffungspreis;
	
	public Briefmarke(float nennwert, String name, int herausgebejahr, int anschaffungspreis)
	{
		this.nennwert = nennwert;
		this.name = name;
		this.herausgebejahr = herausgebejahr;
		this.anschaffungspreis = anschaffungspreis;
	}
	
	float erzielteWertsteigerung(float aktuellerWert)
	{
	
		nennwert = 100 / this.getAnschaffungspreis();
		nennwert = nennwert * aktuellerWert;	
		System.out.println("Der alte Wert der Briefmarke betrug 100 %.");
		System.out.println("Der neue Wert der Briefmarke beträgt: "+this.nennwert+" %.");
		return nennwert;
	}
	
	public double getNennwert() {
		return nennwert;
	}
	public void setNennwert(float nennwert) {
		this.nennwert = nennwert;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHerausgebejahr() {
		return herausgebejahr;
	}
	public void setHerausgebejahr(int herausgebejahr) {
		this.herausgebejahr = herausgebejahr;
	}
	public int getAnschaffungspreis() {
		return anschaffungspreis;
	}
	public void setAnschaffungspreis(int anschaffungspreis) {
		this.anschaffungspreis = anschaffungspreis;
	}
	
	
}
