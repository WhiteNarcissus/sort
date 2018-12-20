package mode.strategy;




import   mjc.domain.User;

import java.util.*;

/**
 * Created by gcb on 2018/12/20.
 */
public class userListOrderStrategy implements OrderStrategy {

    @Override
    public Collection order(List<User> list) {
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if( null  != o1.getUserId() && null != o2.getUserId()){
                   Long a =   o1.getUserId() - o2.getUserId() ;
                return  a.intValue();
                }else
                    return  0 ;

            }
        });
        return list;
    }
}
