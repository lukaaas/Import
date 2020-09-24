
public class Mitarbeiter {
	
	String name;
	String vorname;
	double gehalt;
	double urlaub = 26;	
	
	public double getUrlaub() {
		return urlaub;
	}

	public void setUrlaub(double urlaub) {
		this.urlaub = urlaub;
	}

	Mitarbeiter(String name, String vorname, double gehalt, double urlaub)
	{
		this.name = name;
		this.vorname = vorname;
		this.gehalt = gehalt;
		this.urlaub = urlaub;
	}
	
	public void urlaubNehmen(int tage)
	{
		if(tage < this.getUrlaub())
		{
			System.out.println("Der Urlaub wurde genehmigt");
			urlaub -= tage;
		}else 
		{
			System.out.println("Sie haben zu wenige Urlaubstage");
			System.out.println("Maximal verfügbar sind "+this.getUrlaub()+" Tage.");
		}
			
	}
		
	public void gehaltErhoehen(int betrag)
	{
		double neuerLohn;
		neuerLohn = this.gehalt + betrag;
		System.out.println("Das neue Gehalt von "+vorname+" "+name+" beträgt "+neuerLohn+"€.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public double getGehalt() {
		return gehalt;
	}
	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}
		
	
}
