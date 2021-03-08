package com.vamshi.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages ="com.vamshi.service")
@Import({AopCfg.class,PersistanceCfg.class,ServiceCfg.class})
public class ApplicationCfg {

}
