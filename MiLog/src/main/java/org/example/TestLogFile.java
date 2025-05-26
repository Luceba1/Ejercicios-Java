package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogFile {
    private static final Logger logger = LogManager.getLogger(TestLogFile.class);

    public static void main(String[] args) {
        logger.info("Probando escritura en log.txt");
    }
}

