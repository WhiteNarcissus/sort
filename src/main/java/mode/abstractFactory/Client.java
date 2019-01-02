package mode.abstractFactory;

import mode.simplFactory.Factory;

/**
 * Created by gcb on 2019/1/2.
 * 这么设计的确可以 将具体的实现类 与 客户端分类 ，且可满足 修改一处 便可 切换 大厂 和小厂
 * 但是 也有问题 假如在 AbstractFactory 里面增加 一个新出品  电子手表 新增三个类 修改 AbstractFactory bigFactory smallFactory
 *
 */
public class Client {

    public  static  void  main(String[] args){

         //公司有钱 用贵的电子产品
        AbstractFactory factory = new BigFactory();
        factory.CreateMobile().playGame();
        factory.CreateNotebook().codeDesgin();

        System.out.println("------------今年收入不行---------------");
        //假如公司缩小成本 用便宜的 使用 神州 nokia
         AbstractFactory factory1 = new SmallFactory();
         factory1.CreateMobile().playGame();
         factory1.CreateNotebook().codeDesgin();

    }
}
