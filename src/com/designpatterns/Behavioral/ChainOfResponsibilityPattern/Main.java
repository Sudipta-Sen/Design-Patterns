package com.designpatterns.Behavioral.ChainOfResponsibilityPattern;

// import com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers.DebugLogProcessor;
// import com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers.ErrorLogProcessor;
// import com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers.InfoLogProcessor;
// import com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers.LogProcessor;
import com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers.Logger;

public class Main {
    public static void main(String[] args) {
        // Method-1 if log() kept as public 
        // LogProcessor logger = new InfoLogProcessor(
        //     new DebugLogProcessor(
        //         new ErrorLogProcessor(null)
        //     )
        // );
        // logger.log(LogProcessor.DEBUG, "This is a debug log");
        // logger.log(LogProcessor.ERROR, "This is a error log");
        // logger.log(LogProcessor.INFO, "This is a info log");
        // logger.log(4, "falls into no category");

        // Method-2
        Logger logger = new Logger();
        logger.ERROR("This is a error log");
        logger.INFO("This is a info log");
        logger.DEBUG("This is a debug log");
    }
}
