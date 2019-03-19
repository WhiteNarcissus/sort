package mode.observe;

/**
 * 被观察者 ，领导，微信公众号
 * Created by gcb on 2019/2/14.
 */
public interface Observerable {
     void registerObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObserver();

}
