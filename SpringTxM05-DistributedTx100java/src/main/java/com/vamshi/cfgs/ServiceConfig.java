package com.vamshi.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("serviceConfig")
@ComponentScan(basePackages = "com.vamshi.service")

public class ServiceConfig {

}
