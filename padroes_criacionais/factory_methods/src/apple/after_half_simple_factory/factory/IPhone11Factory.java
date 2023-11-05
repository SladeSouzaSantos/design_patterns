package apple.after_half_simple_factory.factory;

import apple.after_half_simple_factory.model.IPhone;
import apple.after_half_simple_factory.model.IPhone11;
import apple.after_half_simple_factory.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		} else return null;
	}

}
