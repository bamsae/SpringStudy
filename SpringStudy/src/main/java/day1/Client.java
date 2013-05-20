package day1;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 4. 22.
 * Time: 오후 5:24
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Client {

    @Autowired
    private Log log;

    public Client() {
        System.out.println("생성자 log = " + log);
    }

    public void setLog(Log log) {
        this.log = log;
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    public void logic() {
        log.write("log = " + log);
    }
}
