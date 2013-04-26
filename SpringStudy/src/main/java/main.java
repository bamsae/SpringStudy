/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 4. 22.
 * Time: 오후 5:22
 * To change this template use File | Settings | File Templates.
 */
public class main {
    public static void main(String[] args) {
        Client client = new Client();

        client.setLog(new PrettyLog());
        client.biz();
    }

}
