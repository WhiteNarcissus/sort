package mode.factoryMethod;

/**
 * Created by gcb on 2019/1/2.
 */
public class Add extends Operation {
    @Override
    public double calculate(double numa, double numb) {
        result = numa + numb;
        return result;
    }
}
