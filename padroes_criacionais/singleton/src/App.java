import connectionPool.after.ClientSingletonFechandoConexao;
import connectionPool.after.ClientSingletonLimitConexaoError;
import connectionPool.before.ClientSingletonBefore;
import connectionPool.monostate.ClientMonostateFechamentoConexao;
import connectionPool.monostate.ClientMonostateLimitConexaoError;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\nBEFORE");
        System.out.println("--------------");
        ClientSingletonBefore.exemplo();

        System.out.println("\n\nSINGLETON (Sem erro de limite de conexão, por fecha-las após o uso.)");
        System.out.println("--------------");
        ClientSingletonFechandoConexao.exemplo();

        System.out.println("\n\nSINGLETON (Com erro de limite de conexão, por não fecha-las após o uso.)");
        System.out.println("--------------");
        ClientSingletonLimitConexaoError.exemplo();

        System.out.println("\n\nMONOSTATE (Versão modificada do Singleton. Sem erro de limite de conexão, por fecha-las após o uso.)");
        System.out.println("--------------");
        ClientMonostateFechamentoConexao.exemplo();

        System.out.println("\n\nMONOSTATE (Versão modificada do Singleton. Com erro de limite de conexão, por não fecha-las após o uso.)");
        System.out.println("--------------");
        ClientMonostateLimitConexaoError.exemplo();
    }
}
