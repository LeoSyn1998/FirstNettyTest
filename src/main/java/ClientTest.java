import client.EchoClient;

/**
 * @author Administrator
 */
public class ClientTest {
    public static void main(String [] args) throws Exception {
        String [] clientPorts = {"localhost","9999"};
        EchoClient.main(clientPorts);
    }
}
