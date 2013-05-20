package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 5. 2.
 * Time: 오후 5:39
 * To change this template use File | Settings | File Templates.
 */
public class SpringXmlMain {

    public static void main(String[] args) {
        ApplicationContext factory = new GenericXmlApplicationContext("day1/applicationContext.xml");
        Client client = (Client)factory.getBean("client");

        client.logic();
    }
}
