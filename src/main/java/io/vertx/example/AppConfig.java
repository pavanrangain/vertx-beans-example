package io.vertx.example;

import io.vertxbeans.VertxBeans;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by prangain on 6/15/2016.
 */
@Configuration
@ComponentScan("io.vertx.example")
@PropertySource(value = "file:./application.properties", ignoreResourceNotFound = true)
@Import(VertxBeans.class)
public class AppConfig {
    //To resolve ${} in @Value
    /*@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }*/
}
