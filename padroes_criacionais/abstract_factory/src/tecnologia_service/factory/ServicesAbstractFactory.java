package tecnologia_service.factory;

import tecnologia_service.services.CarService;
import tecnologia_service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
