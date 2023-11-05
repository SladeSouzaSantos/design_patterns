package apple.after_factory_method.factory;

import apple.after_factory_method.model.IPhone;
import apple.after_factory_method.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
