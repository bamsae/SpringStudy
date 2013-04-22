/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 4. 22.
 * Time: 오후 5:25
 * To change this template use File | Settings | File Templates.
 */
public class PrettyLog implements Log {
    public void write(String data) {
        System.out.println("***************");
        System.out.println(data);
        System.out.println("***************");
    }
}
