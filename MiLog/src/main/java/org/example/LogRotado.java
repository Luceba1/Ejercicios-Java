package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogRotado {
    private static final Logger logger = LogManager.getLogger(LogRotado.class);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 30; i++) {
            logger.info("Mensaje número " + i);
            Thread.sleep(10_000); // Espera 10 segundos
        }
    }
}

