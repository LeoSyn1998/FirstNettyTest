import server.EchoServer;

/**
 * @author Administrator
 */
public class ServerTest {
    public static void main(String [] args) throws Exception {
        String [] serverPorts = {"7777"};
        EchoServer.main(serverPorts);
    }
}
