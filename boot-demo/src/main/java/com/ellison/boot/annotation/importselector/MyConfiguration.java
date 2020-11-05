package com.ellison.boot.annotation.importselector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * TODO
 *
 * @author leibingguang
 * @since 10/21/20 3:44 PM
 */
@Configuration
@Import(MyImportSelector.class)
public class MyConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(MyConfiguration.class);
    @Bean
    public Object test() {
        logger.info("MyConfiguration create a object bean...");
        return new Object();
    }
}
