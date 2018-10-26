package Exceptions.task04;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.logging.Level;

public class Main {

    private static void configureLogging() {
        Logger logger = Logger.getLogger("org.stepic.java");
        logger.setLevel(Level.ALL);
        XMLFormatter f = new XMLFormatter();
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.ALL);
        ch.setFormatter(f);
        logger.addHandler(ch);
        logger.setUseParentHandlers(false);

        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.setLevel(Level.ALL);

        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerB.setLevel(Level.WARNING);
    }

    public static void main(String[] args) {
        configureLogging();

    }
}