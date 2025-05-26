package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogFormatos {
    private static final Logger logger = LogManager.getLogger(LogFormatos.class);

    public static void main(String[] args) {
        logger.info("Este es un mensaje con distintos formatos.");
    }
}

