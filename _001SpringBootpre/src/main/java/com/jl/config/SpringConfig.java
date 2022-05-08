package com.jl.config;

import com.jl.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @Configuration： 表示当前类作为配置文件使用，就是用来配置文件的
 *          位置：在类的上面
 *
 *  加入这个注解后，当前类SpringConfig这个类就相当于bean.xml
 * */
@Configuration

/**导入其他的xml配置文件*/
@ImportResource(value = {"classpath:beans.xml"})

/**找到properties文件*/
@PropertySource("classpath:config.properties")
/**组件扫描器*/
@ComponentScan(value ="com.jl.vo" )
public class SpringConfig {
    /**
     * 创建方法，方法的返回值是对象，在方法的上面添加@Bean注解
     * 这样就可以将方法返回值对象注入到容器中
     *
     * @Bean： 将对象注入到Spring容器中，作用相当于<bean>标签
     *      位置：方法的上面
     *      当不指定对象名称时，默认是将方法名作为id
     *
     *      指定对象id：
     *      @bean(name="名称")
     *
     */
    @Bean
    public Student zsStudent(){
        Student s1 = new Student("张三",22,"男");
        return s1;
    }
}
