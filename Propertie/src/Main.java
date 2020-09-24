import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Main {

	public static void main(String[] args) {
		
		StringProperty sp = new SimpleStringProperty();
		StringProperty sp2 = new SimpleStringProperty();
		
		sp.set("Baum");
		
		sp2.bind(Bindings.concat(sp, ".jpg"));
		
		System.out.println(sp2.getValue());
		sp.set("Mond");
		System.out.println(sp2.getValue());

	}

}
