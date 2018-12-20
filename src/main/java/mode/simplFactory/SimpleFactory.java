package mode.simplFactory;


/**
 * Created by gcb on 2018/12/20.
 * 简单工厂模式 ，将类的创建 交个 SimpleFactory 要什么类就 写一个case，解耦类的创建 （spring 干的就是这个事情，mybatis 将sql解耦 为 mapper 文件，以及Result 解耦）
 * ps： springBoot 则将 各种配置文件 解耦为注解
 * 但是这样的话依然还是 无法做到真正地解耦 ，还得依赖于case
 */
public class SimpleFactory {

    Integer num  ;



     public void factory(Opt opt ){
      switch (opt) {
        case ADD:
         num = new Integer(1);
          break;
        case REDUCE:
          num = new Integer(0);
          break;

      }
    }

    public  static  void  main(String[] args){
       SimpleFactory simpleFactory = new SimpleFactory();
       simpleFactory.factory(Opt.ADD);
       simpleFactory.factory(Opt.REDUCE);
       System.out.println(simpleFactory.num);

    }

}
