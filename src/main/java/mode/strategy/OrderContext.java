package mode.strategy;

import java.util.Collection;
import java.util.List;

/**
 * Created by gcb on 2018/12/20.
 * 目前策略模式的理解 利用Java多态 ，写一个Strategy 接口，一个Context 成员变量 有Strategy  ，Context构造方法要传入一个Strategy  （控制反转）
 * 然后写 多个策略，比如 顺序排序，倒序排序，实现这个Strategy 接口 （说白了就是 将 具体策略的方法 与 程序 解耦合）
 * 然后用Context 来调 具体策略的方法。
 */
public class OrderContext  {
    private OrderStrategy orderStrategy ;

   public OrderContext(OrderStrategy orderStrategy){
       this.orderStrategy = orderStrategy ;
   }

    public Collection sort( List list){
        return  orderStrategy.order(list);
    }
}


