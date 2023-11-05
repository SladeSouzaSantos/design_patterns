import apple.after_factory_method.ClientFactoryMethod;
import apple.after_half_simple_factory.ClientHalfSimpleFactory;
import apple.after_simple_factory.ClientSimpleFactory;
import apple.before.ClientBefore;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\nBefore");
        System.out.println("-------------------");
        ClientBefore.exemplo();

        System.out.println("\n\nFactory Method");
        System.out.println("-------------------");
        ClientFactoryMethod.exemplo();

        System.out.println("\n\nSimple Factory");
        System.out.println("-------------------");
        ClientSimpleFactory.exemplo();

        System.out.println("\n\nHalf Simple Factory");
        System.out.println("-------------------");
        ClientHalfSimpleFactory.exemplo();
    }
}
