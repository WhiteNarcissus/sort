package mode.generic;

import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.api.scripting.JSObject;
import junit.framework.TestCase;

/**
 * Created by gcb on 2018/12/19.
 */
public class RetuenDemoTest extends TestCase {

    public void testA(){
        User user = new User();
        user.setAge(10);
        user.setSex("男");
        user.setName("毛纪诚");
        user.setPhone("123");
        ReturnObject<User> userReturnObject = new ReturnObject<User>();
        userReturnObject.setData(user);
        userReturnObject.setCode(Code.SUCCESS);
        userReturnObject.setMsg("成功");

        System.out.println("test    "+userReturnObject);

        JSONObject my_json=new JSONObject();
        my_json.put("returnObject",userReturnObject);
        System.out.println("test Json   "+my_json);


    }



}