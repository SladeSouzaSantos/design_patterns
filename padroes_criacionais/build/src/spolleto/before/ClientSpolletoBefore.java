package spolleto.before;

import java.util.Arrays;

import spolleto.before.model.Pasta;
import spolleto.before.model.Size;

public class ClientSpolletoBefore {

	public static void executar() {
		Pasta p1 = new Pasta(Size.LARGE);
		System.out.println(p1);
		
		Pasta p2 = new Pasta(Arrays.asList("Bacon", "Broccoli"), Arrays.asList("Tomato"), Size.SMALL, true);
		System.out.println(p2);
		
		Pasta p3 = new Pasta(Arrays.asList("Garlic"), Arrays.asList("Funghi", "Cheese"), Size.STANDARD, false, true);
		System.out.println(p3);
		
	}
}
