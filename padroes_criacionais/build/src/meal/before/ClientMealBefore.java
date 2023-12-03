package meal.before;

import meal.before.model.FastFoodMeal;

public class ClientMealBefore {

	public static void executar() {
		FastFoodMeal burguerCombo = new FastFoodMeal("Coke", "CheeseBurguer", "Fries");
		System.out.println(burguerCombo);
		
		FastFoodMeal justFries = new FastFoodMeal(null, null, "Fries");
		System.out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMeal("Milk Shake", "Monster Burguer", "Large Fries", "Fudge Cake", "2 Kilograms");
		System.out.println(heartAtackCombo);
	}
}
