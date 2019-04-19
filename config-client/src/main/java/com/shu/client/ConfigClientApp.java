package com.shu.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConfigClientApp {
    public static void main(String[] args){
        SpringApplication.run(ConfigClientApp.class,args);
    }

    @Value("${name}")
    private String name;
    @Value("${age}")
    private  int age;
    @Value("${version}")
    private  String version;
    @RequestMapping(value = "/hi")
    public String hi(){
        return "我的名字："+name+"  年龄："+age+"  版本:"+version;
    }
}
