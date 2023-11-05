package apple.after_gof.factory;

import apple.after_gof.model.IPhone;
import apple.after_gof.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
