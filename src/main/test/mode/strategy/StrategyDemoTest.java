package mode.strategy;

import junit.framework.TestCase;

import org.springframework.test.context.TestExecutionListeners;

import java.text.SimpleDateFormat;

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


}