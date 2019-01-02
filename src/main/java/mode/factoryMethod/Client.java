package mode.factoryMethod;

/**
 * Created by gcb on 2019/1/2.
 */
public class Client {
    public  static  void  main(String[] args){

        Factory factory = new AddFactory();
        Factory factory2 = new ReduceFactory();


       Operation add =  factory.CreateOperation();
       Operation reduce = factory2.CreateOperation();
        double c =  add.calculate(1.0,2.0);
        double d =  reduce.calculate(3.0,2.0);

        System.out.print(c+d);



    }
}
