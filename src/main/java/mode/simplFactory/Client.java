package mode.simplFactory;

/**
 * Created by gcb on 2019/1/2.
 */
public class Client {

    public  static  void  main(String[] args){
        double a= 0.01 ;
        double b = 0.02 ;
      Factory factory =new Factory();
    // 父类 无法看到子类新增的方法 ，但可以 看到子类重写的方法 这个叫多态（动态绑定） 同时也看出命名的重要性
    Operation operation = factory.factory(Opt.ADD);
    Operation operation2= factory.factory(Opt.REDUCE);



     double c = operation.calculate(a,b);
     double d = operation2.calculate(a,b);
     System.out.print(c);
    }
}
