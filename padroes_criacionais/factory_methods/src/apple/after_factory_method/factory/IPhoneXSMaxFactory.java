package apple.after_factory_method.factory;

import apple.after_factory_method.model.IPhone;
import apple.after_factory_method.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
