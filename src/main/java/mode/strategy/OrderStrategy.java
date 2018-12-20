package mode.strategy;

import mjc.domain.User;

import java.util.Collection;
import java.util.List;

/**
 * Created by gcb on 2018/12/20.
 */
public interface OrderStrategy{
    /**
     * 排序策略
     * @param
     * @return
     */
    Collection order(List<User> list);
}
