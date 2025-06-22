package com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers;

public class Logger {
    private LogProcessor chain;
    public Logger() {
        chain = new ErrorLogProcessor(
            new DebugLogProcessor(
                new InfoLogProcessor(null)
            )
        );
    }

    public void ERROR(String msg) {
        chain.log(LogProcessor.ERROR, msg);
    }

    public void INFO(String msg) {
        chain.log(LogProcessor.INFO, msg);
    }

    public void DEBUG(String msg) {
        chain.log(LogProcessor.DEBUG, msg);
    }
}
