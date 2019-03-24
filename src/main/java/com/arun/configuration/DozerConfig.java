package com.arun.configuration;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by arun on 11/02/19.
 */
@Configuration
public class DozerConfig {

    @Bean
    public DozerBeanMapper getDozerBeanMapper() {
        return new DozerBeanMapper();
    }

}
