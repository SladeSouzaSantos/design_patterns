package apple;

import apple.factory.IPhone11Factory;
import apple.factory.IPhoneFactory;
import apple.factory.IPhoneXFactory;
import apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import apple.factory.abstractFactory.CountryRulesAbstractFactory;
import apple.model.iphone.IPhone;

public class ClientAbstractFactory {
	
	public static void exemplo() {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
