package apple.after_gof.factory;

import apple.after_gof.model.IPhone;
import apple.after_gof.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
