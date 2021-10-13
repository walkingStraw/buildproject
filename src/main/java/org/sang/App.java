package org.sang;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class App {
    public static void main(String[] args){
//        SpringApplication.run(App.class,args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(App.class);
        builder.bannerMode(Banner.Mode.CONSOLE).run(args);
    }
}
