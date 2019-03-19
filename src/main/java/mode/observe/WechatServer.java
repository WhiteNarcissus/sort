package mode.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gcb on 2019/2/14.
 */
public class WechatServer implements Observerable {

    //将订阅者放入一个集合
    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer observer) {

        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    // 遍历 通知所有订阅了 这个公众号的人
    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.update(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }


}
