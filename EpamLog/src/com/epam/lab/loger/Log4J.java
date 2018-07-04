package com.epam.lab.loger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4J  {
     private static final Logger LOG = Logger.getLogger(Log4J.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("src/resources/log4j.properties");
        LOG.info("Info message");
        LOG.debug("Debug message");
        LOG.warn("Warn message");
        LOG.error("Error message");
        LOG.fatal("Fatal message");

    }

}
