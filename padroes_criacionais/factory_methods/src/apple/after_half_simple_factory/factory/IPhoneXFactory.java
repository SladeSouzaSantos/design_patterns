package apple.after_half_simple_factory.factory;

import apple.after_half_simple_factory.model.IPhone;
import apple.after_half_simple_factory.model.IPhoneX;
import apple.after_half_simple_factory.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
