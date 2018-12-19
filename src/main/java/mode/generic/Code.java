package mode.generic;

/**
 * Created by gcb on 2018/12/19.
 * 为什么使用枚举类，
 * 有些对象是有限且固定的
 */
public enum Code {

    /**
     * 实际上写这一行的时候就执行了  私有的带参数的构造方法
     */
    SUCCESS(100,"成功"),FAIL(000,"失败"),ERRO(500,"代码错误"),NOTFOUND(404,"请求失败");
    private final String name ;
    private final int value ;

    /**
     *枚举类的 构造方法 必须私有 （防止在其它地方改变成员变量）
     * @param name
     */
    private Code(int value ,String name)
    {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
