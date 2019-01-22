package mjc.service.impl;

import mjc.dao.configuration.TestConfigration;
import mjc.domain.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gcb on 2019/1/18.
 */
public class testServiceImpl {
    public static void main(String[] args) {

        // @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfigration.class);

        /**

         <web-app>

         <context-param>
         <param-name>contextClass</param-name>
         <param-value>
         org.springframework.web.context.
         support.AnnotationConfigWebApplicationContext
         </param-value>
         </context-param>


         <context-param>
         <param-name>contextConfigLocation</param-name>
         <param-value>
         demo.AppContext
         </param-value>
         </context-param>




         <listener>
         <listener-class>
         org.springframework.web.context.ContextLoaderListener
         </listener-class>
         </listener>


         <servlet>
         <servlet-name>sampleServlet</servlet-name>
         <servlet-class>
         org.springframework.web.servlet.DispatcherServlet
         </servlet-class>

         <init-param>
         <param-name>contextClass</param-name>
         <param-value>
         org.springframework.web.context.
         support.AnnotationConfigWebApplicationContext
         </param-value>
         </init-param>

         </servlet>

         ...
         </web-app>

         以上修改后的 web.xml 现在定义了 AnnotationConfigWebApplicationContext 上下文类，并将其作为上下文参数和 servlet 元素的一部分。
         上下文配置位置现在指向 AppContext 配置类。这非常简单。下一节将演示 bean 的生命周期回调和范围的实现。



         */
















        // 如果加载spring-context.xml文件：
        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("spring-context.xml");

        //获取bean
        TestBean tb = (TestBean) context.getBean("testBean");
        tb.setTest("111");
        System.out.println(tb.getTest());
        tb.cleanUp();
    }

}
