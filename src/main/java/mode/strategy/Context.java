package mode.strategy;

/**
 * Created by gcb on 2018/12/17.
 */
public class Context {
    private Strategy strategy ;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(Strategy strategy){

    }

    public  double execute(double a , double b ){

      return  strategy.opt(a,b);
    }
}
