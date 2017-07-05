package com.schien;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import sun.jvm.hotspot.HelloWorld;

/**
 * Created by csxds on 05/07/2017.
 */
//@Configuration
public class MarkingAppConfiguration {
    @Bean
    @Primary
    public TEPlatform tEPlatform() {
        return new SAFETEPlatform();
    }
}

