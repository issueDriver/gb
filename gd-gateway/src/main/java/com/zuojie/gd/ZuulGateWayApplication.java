package com.zuojie.gd;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateWayApplication.class,args);
    }
}
