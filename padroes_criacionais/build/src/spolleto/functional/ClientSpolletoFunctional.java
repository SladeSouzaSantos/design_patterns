package spolleto.functional;

import spolleto.functional.model.Pasta;
import spolleto.functional.model.Size;

public class ClientSpolletoFunctional {

	public static void executar() {
		Pasta p1 = new Pasta.Builder(Size.LARGE).now();
		System.out.println(p1);
		
		Pasta p2 = new Pasta.Builder(Size.SMALL)
				.withToppings("Bacon", "Broccoli")
				.withSauces("Tomato")
				.withCheese()
				.now();
		System.out.println(p2);
		
		Pasta p3 = new Pasta.Builder(Size.STANDARD)
				.withToppings("Garlic")
				.withSauces("Funghi", "Cheese")
				.withCheese()
				.withPepper()
				.now();
		System.out.println(p3);
	}
}
