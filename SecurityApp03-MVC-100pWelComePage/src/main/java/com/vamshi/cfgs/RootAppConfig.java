package com.vamshi.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {Persistance.class,SecurityConfig.class,ServiceConfig.class})
public class RootAppConfig {

}
