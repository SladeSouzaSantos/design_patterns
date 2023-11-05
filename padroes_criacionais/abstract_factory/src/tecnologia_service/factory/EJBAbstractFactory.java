package tecnologia_service.factory;

import tecnologia_service.services.CarEJBService;
import tecnologia_service.services.CarService;
import tecnologia_service.services.UserEJBService;
import tecnologia_service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



