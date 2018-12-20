package mode.simplFactory;

/**
 * Created by gcb on 2018/12/20.
 */
public enum Opt {

    ADD("+"),REDUCE("-");

    private final String opt ;

    private   Opt(String opt){
        this.opt = opt ;
    }

    public String getOpt() {
        return opt;
    }
}
