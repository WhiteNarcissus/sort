package mjc.myutil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;


/**
 * Created by gcb on 2018/12/21.
 * 用来自己封装 redisTemple 操作redis的增删改查
 */

public class RedisUtils {

    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private static RedisTemplate<String,Object> redisTemplate = (RedisTemplate) SpringBeanLoader.getBean("redisTemple");

     /**
      * String
      * 因为不是经常用这个类 所以只对String 进行封装
      */
     public static String get(String key){
         String value = null ;
         try {
             if(existsObject(key)) {
                 value = redisTemplate.opsForValue().get(key).toString();

             }

         }catch (Exception e){
             value = "";
         }

         return value;
     }

     public static String  set(String key,Object value){
         String result = null ;
         try {
             redisTemplate.opsForValue().set(key,value);

         }catch (Exception e){

         }

        return  result;

     }



     /**
      * 缓存是否存在
      */
     public static boolean existsObject(String key) {
         boolean result = false ;
         try {
             result = redisTemplate.hasKey(key);
         }catch (Exception e){

         }

         return result ;

     }



}
