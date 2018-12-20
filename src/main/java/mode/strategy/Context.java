package mode.strategy;

import java.util.Collection;

/**
 * Created by gcb on 2018/12/17.
 * 此类事用来操作计算的
 */
public class Context  {
    private Strategy strategy ;


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public  double execute(double a , double b ){

      return  strategy.opt(a,b);
    }

}
