package org.example;

import org.example.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        SpringBean1 springBean1=context.getBean(SpringBean1.class);
        System.out.println(springBean1.greet());

        context.close();
    }
}