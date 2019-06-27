import server.EchoServer;

/**
 * @author Administrator
 */
public class ServerTest {
    public static void main(String [] args) throws Exception {
        String [] serverPorts = {"9999"};
        EchoServer.main(serverPorts);
    }
}
