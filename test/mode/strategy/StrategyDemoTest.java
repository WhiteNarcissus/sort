package mode.strategy;

import junit.framework.TestCase;

import mjc.domain.User;
import org.springframework.test.context.TestExecutionListeners;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by gcb on 2018/12/18.
 */
public class StrategyDemoTest extends TestCase {

    public void testA(){
        System.out.println("123");
        try {
            System.out.println(new SimpleDateFormat("yyyyMMdd").parse("19961111").getTime());
        }
        catch(Exception e){

        }
        }

    public void testOrder(){
       List<User> userList = new ArrayList<>();

        User ua = new User();
        User ub = new User();
        User uc = new User();
        ua.setUserId(1l);
        ua.setUserName("9527");
        ub.setUserId(2l);
        ub.setUserName("9528");
        uc.setUserId(3L);
        uc.setUserName("9529");
        userList.add(ua);
        userList.add(uc);
        userList.add(ub);

        OrderContext orderContext = new OrderContext(new userListOrderStrategy());

          Collection us =  orderContext.sort(userList);
       System.out.println(us.size());




    }


}