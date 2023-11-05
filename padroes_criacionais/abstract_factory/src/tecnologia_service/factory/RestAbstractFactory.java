package tecnologia_service.factory;

import tecnologia_service.services.CarRestApiService;
import tecnologia_service.services.CarService;
import tecnologia_service.services.UserRestApiService;
import tecnologia_service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
