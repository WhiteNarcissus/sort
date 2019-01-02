package mode.factoryMethod;

/**
 * Created by gcb on 2019/1/2.
 */
public class ReduceFactory extends Factory {
    @Override
    Operation CreateOperation() {
        Operation operation = new Reduce();
        return  operation;
    }
}
