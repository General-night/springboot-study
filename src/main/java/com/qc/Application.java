package com.qc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;

/**
 * @Author：MoneyOrange
 * @Date：2023/4/2/21:02
 */

@Slf4j
//@Import({User.class, DBHelper.class})
@ImportResource("classpath:bean.xml")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 1. 返回我们IOC容器
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        log.info("SpringbootStudy项目已启动>>>");

        //// 2. 查看容器里面的组件
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
        //
        //Pet pet_01 = applicationContext.getBean("tom", Pet.class);
        //Pet pet_02 = applicationContext.getBean("tom", Pet.class);
        //log.info("组件：pet_01 {} pet_02", Objects.equals(pet_01, pet_02) ? "==" : "!=");
        //
        //// com.qc.boot.config.MyConfig$$EnhancerBySpringCGLIB$$51f1e1ca@1654a892
        //MyConfig myConfig = applicationContext.getBean(MyConfig.class);
        //log.info("myConfig is {}", myConfig);
        //
        //// 如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        //// 保持组件单实例
        //User user_1 = myConfig.user_01();
        //User user_2 = myConfig.user_01();
        //log.info("user_1 {} user_2", Objects.equals(user_1, user_2) ? "==" : "!=");
        //
        //System.out.println("=============");
        //String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
        //System.out.println("beanNamesForType = " + Arrays.toString(beanNamesForType));

        //boolean user01 = applicationContext.containsBean("user_01");
        //System.out.println("user01 = " + user01);
        //boolean tom = applicationContext.containsBean("tom");
        //System.out.println("tom = " + tom);

        //boolean haha = applicationContext.containsBean("haha");
        //System.out.println("haha = " + haha);
    }
}
