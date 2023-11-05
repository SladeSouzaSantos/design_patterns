package apple.after_half_simple_factory;

import apple.after_half_simple_factory.factory.IPhone11Factory;
import apple.after_half_simple_factory.factory.IPhoneFactory;
import apple.after_half_simple_factory.factory.IPhoneXFactory;
import apple.after_half_simple_factory.model.IPhone;

public class ClientHalfSimpleFactory {
	
	public static void exemplo() {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
