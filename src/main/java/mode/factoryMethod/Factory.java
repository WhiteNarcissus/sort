package mode.factoryMethod;

/**
 * Created by gcb on 2019/1/2.
 * 工厂方法模式
 * 将判断生成哪种类的逻辑 解耦合
 * 与策略模式 有点像 ，但用的是继承 ，不需要注入。
 * 而策略模式用的是 依赖注入 和 接口。
 */
public abstract class Factory {

    Operation CreateOperation(){
        Operation operation = null ;
        return  operation ;
    }
}
