package io.vertx.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by prangain on 6/15/2016.
 */
public class MainClass {
    public static void main(String[] args){
        new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
