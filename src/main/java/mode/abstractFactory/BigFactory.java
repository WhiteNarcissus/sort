package mode.abstractFactory;

/**
 * Created by gcb on 2019/1/2.
 */
public class BigFactory implements AbstractFactory {
    @Override
    public Mobile CreateMobile() {
        return  new Huawei();
    }

    @Override
    public Notebook CreateNotebook() {
        return  new Mac();
    }
}
