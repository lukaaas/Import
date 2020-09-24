public class Nudeln extends Gericht{

	Nudeln(String name, double basispreis) {
		super(name, basispreis);
		
	}

	String sauce;
	boolean ueberbacken;
	String back = "al forno";
	
	
	
	public Nudeln(String name, double basispreis, String sauce, boolean ueberbacken, String back) {
		super(name, basispreis);
		this.sauce = sauce;
		this.ueberbacken = ueberbacken;
		this.back = back;
	}



	public String getSauce() {
		return sauce;
	}



	public void setSauce(String sauce) {
		this.sauce = sauce;
	}



	public boolean isUeberbacken() {
		return ueberbacken;
	}



	public void setUeberbacken(boolean ueberbacken) {
		this.ueberbacken = ueberbacken;
	}



	public String getBack() {
		return back;
	}



	public void setBack(String back) {
		this.back = back;
	}



	public String ueberbacken()
	{
		if(ueberbacken == true)
		{
			System.out.println(name + back);
		}
		return back ;
	}



}
