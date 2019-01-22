package mjc.dao.configuration;

import mjc.domain.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by gcb on 2019/1/21.
 */
//标记 这个类为 xml ，（可以写构造方法）
@Configuration
//扫描 这个包下的 注解 ，并将其纳入 spring 容器
@ComponentScan(basePackages = "mjc.dao.configuration")
//@ImportResource("classpath:applicationContext-configuration.xml") 和xml 的  <import resource="classpath:spring/spring_mvc.xml" /> 一样
public class TestConfigration {

    public TestConfigration() {
        System.out.println("TestConfiguration容器启动初始化。。。");
    }

    // @Bean注解注册bean,同时可以指定初始化和销毁方法
    // @Bean(name="testBean",initMethod="start",destroyMethod="cleanUp")
    @Bean
    @Scope("prototype")
    public TestBean testBean() {
        return new TestBean();
    }

}
