package com.ellison.boot.annotation.importselector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 *
 * @author leibingguang
 * @since 10/21/20 2:55 PM
 */
public class MyConfiguration2 {
    private static final Logger logger = LoggerFactory.getLogger(MyConfiguration2.class);
    public MyConfiguration2() {
        logger.info("MyConfiguration1 construct...");
    }

    public void execute() {
        logger.info("MyConfiguration1 execute...");
    }
}
