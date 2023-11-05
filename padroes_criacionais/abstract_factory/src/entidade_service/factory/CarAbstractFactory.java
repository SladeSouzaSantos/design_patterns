package entidade_service.factory;

import entidade_service.services.CarEJBService;
import entidade_service.services.CarRestApiService;
import entidade_service.services.CarService;

public class CarAbstractFactory implements ServicesAbstractFactory {

	@Override
	public CarService getEJBService() {
		return new CarEJBService();
	}

	@Override
	public CarService getRestService() {
		return new CarRestApiService();
	}

}
