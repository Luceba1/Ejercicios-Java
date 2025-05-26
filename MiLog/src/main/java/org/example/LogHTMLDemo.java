package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHTMLDemo {
    private static final Logger logger = LogManager.getLogger(LogHTMLDemo.class);

    public static void main(String[] args) {
        logger.info("Este log se guarda como archivo HTML");
        logger.warn("¡Atención, este es un WARN en HTML!");
        logger.error("Esto es un ERROR en HTML.");
    }
}


