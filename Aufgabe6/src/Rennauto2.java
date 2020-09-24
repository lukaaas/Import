
public class Rennauto2 {
	int startnummer;
	String fahrer;
	String name;
	String farbe;
	int geschwindigkeit;
	int runden;
	public Rennauto2(int startnummer, String fahrer, String name, String farbe, int geschwindigkeit) {
		super();
		this.startnummer = startnummer;
		this.fahrer = fahrer;
		this.name = name;
		this.farbe = farbe;
		this.geschwindigkeit = geschwindigkeit;
		this.runden = 0;
	}
	public int getStartnummer() {
		return startnummer;
	}
	public void setStartnummer(int startnummer) {
		this.startnummer = startnummer;
	}
	public String getFahrer() {
		return fahrer;
	}
	public void setFahrer(String fahrer) {
		this.fahrer = fahrer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}
	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}
	public int getRunden() {
		return runden;
	}
	public void setRunden(int runden) {
		this.runden = runden;
	}
}
