package entidade_service.factory;

import entidade_service.services.Service;

public interface ServicesAbstractFactory {

	Service getEJBService();
	
	Service getRestService();
}
