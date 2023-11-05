package apple.after_factory_method;

import apple.after_factory_method.factory.IPhone11ProFactory;
import apple.after_factory_method.factory.IPhoneFactory;
import apple.after_factory_method.factory.IPhoneXFactory;
import apple.after_factory_method.model.IPhone;

public class ClientFactoryMethod {
	
	public static void exemplo() {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
