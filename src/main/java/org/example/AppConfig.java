package org.example;

import org.example.beans.SpringBean1;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public SpringBean1 springBean1(){
        return new SpringBean1();
    }
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor(){
        return new CustomBeanFactoryPostProcessor();
    }
    @Bean
    public static BeanPostProcessor beanPostProcessor(){
        return new CustomBeanPostProcessor();
    }
}