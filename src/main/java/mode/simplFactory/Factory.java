package mode.simplFactory;

/**
 * Created by gcb on 2018/12/20.
 * 工厂模式
 */
public class Factory {




    public   Operation factory(Opt opt ){
        Operation oper = null ;

        switch (opt) {
            case ADD:
                oper = new Add();

            break;
            case REDUCE:
                oper = new Reduce();

                break;

        }
        return oper ;
}

}
