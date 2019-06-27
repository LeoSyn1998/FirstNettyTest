import client.EchoClient;

/**
 * @author Administrator
 */
public class ClientTest {
    public static void main(String [] args) throws Exception {
        String [] clientPorts = {"localhost","7777"};
        EchoClient.main(clientPorts);
    }
}
