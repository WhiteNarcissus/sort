package mjc.myutil;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/**
 * Created by gcb on 2018/12/24.
 */
public class SpringBeanLoader implements ApplicationContextAware {

    /**
     spring 的上下文容器Spring有两个核心接口：BeanFactory和ApplicationContext，
     其中ApplicationContext是BeanFactory的子接口。他们都可代表Spring容器，Spring容器是生成Bean实例的工厂，并且管理容器中的Bean。
     BeanFactoryAware接口仅有如下一个方法：
     SetBeanFactory(BeanFactory beanFactory)：该方法有一个参数beanFactory，该参数指向创建它的BeanFactory。
     该方法将由Spring调动，当Spring调用该方法时会将Spring容器作为参数传入该方法。

     下面的代码虽然实现了ApplicationContextAware接口让Bean拥有了访问容器的能力，
     但是污染了代码，导致代码与Spring接口耦合在一起。所以，如果不是特别需要，一般不建议直接访问容器。

     所以写在这里只是为看看 并不会使用这个类
     */
    private static  ApplicationContext applicationContext ;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanLoader.applicationContext = applicationContext ;

    }

    public static  Object getBean(String beanName)throws BeansException {

     return  applicationContext.getBean(beanName);
    }
}
