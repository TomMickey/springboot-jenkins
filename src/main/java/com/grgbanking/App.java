package com.grgbanking;

import com.grgbanking.entity.ProfileBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试@Profile
 */
public class App {

    public static void main(String[] args) {
        //1、因为配置类，需重新指定模式(开发或是生产等)，所以在新建annotation时，不用加载配置类。
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //2、使用Environment来指定当前运行的模式，指定的值必须和@Profile注解中自定义的值匹配。否则都不执行。
        context.getEnvironment().setActiveProfiles("dev");
        //3、指定模式后，再注册Bean
        context.register(ProfileConfig.class);
        //4、刷新容器，注册生效。
        context.refresh();
        //5.
        ProfileBean bean = context.getBean(ProfileBean.class);
        System.out.println(bean.getContent());
        context.close();
    }
}
