package mode.abstractFactory;

/**
 * Created by gcb on 2019/1/2.
 *抽象工厂 用于生产电子产品 手机 电脑
 */
public interface AbstractFactory {

  Mobile CreateMobile();

  Notebook CreateNotebook();

}
