
public class Autorennen
{
	Rennauto [] teilnehmer;
	int distanz;
	
	public Autorennen (Rennauto [] teilnehmer, int distanz)
	{
		this.teilnehmer = teilnehmer;
		this.distanz = distanz;
	}
	
	public void alleFahren ()
	{
		for (int startnummer = 0; startnummer < this.teilnehmer.length; startnummer++)
		{
			this.teilnehmer[startnummer].fahren();
		}
		System.out.println();
	}
	
	public boolean zuEnde ()
	{
		boolean zuEnde = false;
		
		for (int startnummer = 0; startnummer < this.teilnehmer.length; startnummer++)
		{
			if (this.teilnehmer[startnummer].getRunden() > this.getDistanz())
				zuEnde = true;
		}		
		
		return zuEnde;
	}
	
	public Rennauto sieger ()
	{
		Rennauto sieger = this.teilnehmer [0];
		
		{
			int maxRunden = this.teilnehmer [0].getRunden();			
			
			for (int startnummer = 1; startnummer < this.teilnehmer.length; startnummer++)
			{
				if (this.teilnehmer[startnummer].getRunden() > maxRunden)
				{
					maxRunden = this.teilnehmer [startnummer].getRunden();
					sieger = this.teilnehmer [startnummer];
				}					
			}
		}
		
		return sieger;
	}

	public Rennauto[] getTeilnehmer()
	{
		return teilnehmer;
	}

	public void setTeilnehmer(Rennauto[] teilnehmer)
	{
		this.teilnehmer = teilnehmer;
	}

	public int getDistanz()
	{
		return distanz;
	}

	public void setDistanz(int distanz)
	{
		this.distanz = distanz;
	}	
}
