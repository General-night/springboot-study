package com.qc.config;

import com.qc.entity.Pet;
import com.qc.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author：MoneyOrange
 * @Date：2023/4/2/23:30
 */
@Configuration // 告诉SpringBoot这是一个配置类 <==> XML配置文件
public class MyConfig {

    /**
     * Full:外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     *
     * @return
     */
    @Bean // 给容器添加组件，以方法名作为组件的id，返回类型时组件类型，返回值就是组件在容器中保存的值
    public User user_01() {
        return new User("Alien", 18);
    }

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }
}
