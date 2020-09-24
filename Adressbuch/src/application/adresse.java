package application;

public class adresse extends AdressBuch {

	String vornamE;
	String nachnamE;
	String telefoN;
	String emaiL;
	
	public adresse(String vorname, String nachname, String telefon, String email){
		
		this.vornamE = vorname;
		this.nachnamE = nachname;
		this.telefoN = telefon;
		this.emaiL = email;
		
	}
	
	@Override
	public String toString(){
		
		return String.format("Vorname: %s, Nachname: %s, Telefon: %s, Email: %s", vornamE, nachnamE, telefoN, emaiL);
	}
	
	
	
	
}
