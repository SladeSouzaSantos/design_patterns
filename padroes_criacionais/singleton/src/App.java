import connectionPool.before.ClientSingletonBefore;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("BEFORE");
        System.out.println("--------------");
        ClientSingletonBefore.exemplo();
    }
}
