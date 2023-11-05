import apple.ClientAbstractFactory;
import entidade_service.ClientAbstractFactoryAlternativoEntidade;
import tecnologia_service.ClientAbstractFactoryAlternativoTecnologia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\nAbstract Factory");
        System.out.println("----------------");
        ClientAbstractFactory.exemplo();

        System.out.println("\n\nAbstract Factory por Tecnologia");
        System.out.println("----------------");
        ClientAbstractFactoryAlternativoTecnologia.exemplo();

        System.out.println("\n\nAbstract Factory por Entidade");
        System.out.println("----------------");
        ClientAbstractFactoryAlternativoEntidade.exemplo();
    }
}
