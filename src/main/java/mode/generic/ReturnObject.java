package mode.generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gcb on 2018/12/19.
 *
 */
public class ReturnObject<T> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private T data ;

    private Code code ;

    private String msg ;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
