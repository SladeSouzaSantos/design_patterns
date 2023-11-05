package apple.after_factory_method.factory;

import apple.after_factory_method.model.IPhone;
import apple.after_factory_method.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
