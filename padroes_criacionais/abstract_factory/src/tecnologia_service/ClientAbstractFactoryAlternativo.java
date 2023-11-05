package tecnologia_service;

import tecnologia_service.factory.EJBAbstractFactory;
import tecnologia_service.factory.ServicesAbstractFactory;
import tecnologia_service.services.CarService;
import tecnologia_service.services.UserService;

public class ClientAbstractFactoryAlternativo {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();
		
		UserService userService = factory.getUserService();
		userService.save("Jhon");
		userService.delete(5);
		
		CarService carService = factory.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");
	}
}
