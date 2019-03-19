package mode.simplFactory;

/**
 * 简单工厂
 * Created by gcb on 2019/1/2.
 */
public class Add extends Operation {

    public double calculate(double numa, double numb) {
        result = numa + numb;
        return result;
    }

}
