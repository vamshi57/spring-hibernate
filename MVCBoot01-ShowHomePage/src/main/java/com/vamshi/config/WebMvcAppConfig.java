package com.vamshi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.vamshi.controller")
public class WebMvcAppConfig {

}
