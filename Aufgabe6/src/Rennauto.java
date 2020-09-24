
public class Rennauto
{
	int startnummer;
	String fahrer;
	String name;
	String farbe;
	int geschwindigkeit;
	int runden;	
	
	public Rennauto ()
	{
		
	}
	public Rennauto (int startnummer, String fahrer, String name, String farbe, int geschwindigkeit)
	{
		this.startnummer = startnummer;
		this.fahrer = fahrer;
		this.name = name;
		this.farbe = farbe; 
		this.geschwindigkeit = geschwindigkeit;		
		this.runden = 0;		
	}	

	public int getStartnummer()
	{
		return startnummer;
	}

	public void setStartnummer(int startnummer)
	{
		this.startnummer = startnummer;
	}

	public String getFahrer()
	{
		return fahrer;
	}

	public void setFahrer(String fahrer)
	{
		this.fahrer = fahrer;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getFarbe()
	{
		return farbe;
	}

	public void setFarbe(String farbe)
	{
		this.farbe = farbe;
	}

	public int getGeschwindigkeit()
	{
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(int geschwindigkeit)
	{
		this.geschwindigkeit = geschwindigkeit;
	}	

	public int getRunden()
	{
		return runden;
	}

	public void setRunden(int strecke)
	{
		this.runden = strecke;
	}	
	
	public void fahren ()
    {
        double faktor = Math.random() * 0.25 + 0.25;        
        
        this.runden += this.getGeschwindigkeit() * faktor;
        
        System.out.println("Der " + this.getFarbe() + "e " + this.getName() + ", gefahren von " + this.getFahrer() 
        + ", hat jetzt " + this.getRunden() + " Runden zurückgelegt.");     
    }
}
