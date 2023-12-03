import meal.after.ClientMealAfter;
import meal.before.ClientMealBefore;
import meal.fluent.ClientMealFluent;
import meal.functional.ClientMealFunctional;
import spolleto.after.ClientSpolletoAfter;
import spolleto.before.ClientSpolletoBefore;
import spolleto.fluent.ClientSpolletoFluent;
import spolleto.functional.ClientSpolletoFunctional;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nMEAL\n");
        ClientMealBefore.executar();
        pularLinha();
        ClientMealAfter.executar();
        pularLinha();
        ClientMealFluent.executar();
        pularLinha();
        ClientMealFunctional.executar();
        pularLinha();

        System.out.println("\nSPOLLETO\n");
        ClientSpolletoBefore.executar();
        pularLinha();
        ClientSpolletoAfter.executar();
        pularLinha();
        ClientSpolletoFluent.executar();
        pularLinha();
        ClientSpolletoFunctional.executar();
    }

    private static void pularLinha(){
        System.out.println("\n\n");
    }
}
