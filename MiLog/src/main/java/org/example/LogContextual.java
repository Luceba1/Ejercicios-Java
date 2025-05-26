package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class LogContextual {
    private static final Logger logger = LogManager.getLogger(LogContextual.class);

    public static void main(String[] args) {
        // Agregar datos contextuales
        ThreadContext.put("userId", "lucas_123");
        ThreadContext.put("modulo", "facturacion");

        logger.info("Inicio del proceso.");
        logger.warn("Advertencia en ejecución.");
        logger.error("Error crítico.");

        // Limpiar contexto (opcional)
        ThreadContext.clearAll();
    }
}

