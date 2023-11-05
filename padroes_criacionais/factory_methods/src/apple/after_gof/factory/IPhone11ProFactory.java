package apple.after_gof.factory;

import apple.after_gof.model.IPhone;
import apple.after_gof.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
