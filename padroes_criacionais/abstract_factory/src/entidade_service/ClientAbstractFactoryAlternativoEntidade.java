package entidade_service;

import entidade_service.factory.UserAbstractFactory;
import entidade_service.factory.CarAbstractFactory;
import entidade_service.factory.ServicesAbstractFactory;
import entidade_service.services.Service;
import entidade_service.services.CarService;
import entidade_service.services.UserService;

public class ClientAbstractFactoryAlternativoEntidade {

	public static void exemplo() {
		ServicesAbstractFactory factoryUser = new UserAbstractFactory();
		ServicesAbstractFactory factoryCar = new CarAbstractFactory();
		
		Service userServiceEJB = factoryUser.getEJBService();
		if (userServiceEJB instanceof UserService) {
			UserService userService = (UserService) userServiceEJB;
			userService.save("Jhon");
			userService.delete(5);
		} else {
			System.out.println("Erro: userServiceEJB não é uma instância de UserService.");
		}
		
		Service carServiceEJB = factoryCar.getEJBService();
		if (carServiceEJB instanceof CarService) {
			CarService carService = (CarService) carServiceEJB;
			carService.save("Prius");
			carService.update("Tesla X");
		} else {
			System.out.println("Erro: carServiceEJB não é uma instância de CarService.");
		}
	}
}
