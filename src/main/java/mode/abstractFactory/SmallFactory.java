package mode.abstractFactory;

/**
 * Created by gcb on 2019/1/2.
 *小厂只能生产 noka  shengzhou
 */
public class SmallFactory implements AbstractFactory {
    @Override
    public Mobile CreateMobile() {
        return new Nokia();
    }

    @Override
    public Notebook CreateNotebook() {
        return  new Shengzhou();
    }

}
