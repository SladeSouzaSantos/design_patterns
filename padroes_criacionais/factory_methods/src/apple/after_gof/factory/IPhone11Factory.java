package apple.after_gof.factory;

import apple.after_gof.model.IPhone;
import apple.after_gof.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
