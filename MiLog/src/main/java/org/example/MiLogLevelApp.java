package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MiLogLevelApp {
    private static final Logger logger = LogManager.getLogger(MiLogLevelApp.class);

    public static void main(String[] args) {
        logger.info("Este es un mensaje INFO.");
        logger.warn("Este es un mensaje WARNING.");
        logger.error("Este es un mensaje ERROR.");
    }
}


