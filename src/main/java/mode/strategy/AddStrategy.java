package mode.strategy;

/**
 * Created by gcb on 2018/12/17.
 */
public class AddStrategy implements  Strategy {
    @Override
    public double opt(double a, double b) {
        return a+b;
    }
}
