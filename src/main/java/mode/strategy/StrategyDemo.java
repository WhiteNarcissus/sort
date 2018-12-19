package mode.strategy;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by gcb on 2018/12/17.
 */
public class StrategyDemo {


   AbstractCollection b = new ArrayList();

   public static void main(String[] args){
      Context context = new Context(new ReduceStrategy());
      double a = context.execute(1.1,2.1);
      System.out.println("加法"+a);

   }




};
