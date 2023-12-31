package meal.after;

import meal.after.builder.FastFoodMealBuilder;
import meal.after.builder.FatMealBuilder;
import meal.after.builder.JustFriesBuilder;
import meal.after.builder.Menu1Builder;
import meal.after.builder.Menu2Builder;
import meal.after.director.MealDirector;

public class ClientMealAfter {
	
	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		
		System.out.println("------------------");
	}

	public static void executar() {
		order("Burguer", new Menu1Builder());
		order("Veggie Burguer", new Menu2Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}