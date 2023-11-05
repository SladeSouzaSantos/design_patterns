package apple.after_factory_method.factory;

import apple.after_factory_method.model.IPhone;
import apple.after_factory_method.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
