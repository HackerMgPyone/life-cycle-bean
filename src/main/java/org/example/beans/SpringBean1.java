package org.example.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean1 implements InitializingBean , DisposableBean {
    private SpringBean2 springBean2;

    public SpringBean1(){
        System.out.println(this.getClass().getSimpleName()+"::constructor");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println(this.getClass().getSimpleName() +"::postConstruct()");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy()");
    }
    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        System.out.println(this.getClass().getSimpleName()+"::setSpringBean2(SpringBean2 springBean2)");
        this.springBean2 = springBean2;
    }

    public String greet(){
        return "Hello!";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "::afterPropertiesSet() ");
    }
    public void customInit(){
        System.out.println(this.getClass().getSimpleName() + "customInit()");
    }
    public void customDestroy(){
        System.out.println("customDestroy()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean::destroy()");
    }
}