package apple.after_simple_factory;

import apple.after_simple_factory.factory.IPhoneSimpleFactory;
import apple.after_simple_factory.model.IPhone;

public class ClientSimpleFactory {
	
	public static void exemplo() {
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
