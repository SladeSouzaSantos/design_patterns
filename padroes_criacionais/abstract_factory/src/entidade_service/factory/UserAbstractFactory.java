package entidade_service.factory;

import entidade_service.services.UserEJBService;
import entidade_service.services.UserRestApiService;
import entidade_service.services.UserService;

public class UserAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getEJBService() {
		return new UserEJBService();
	}

	@Override
	public UserService getRestService() {
		return new UserRestApiService();
	}

}



