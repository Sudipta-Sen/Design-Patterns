package com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor logProcessor) {
        nextLogProcessor = logProcessor;
    }

    protected void log(int level, String msg) {
        if (nextLogProcessor!=null) {
            nextLogProcessor.log(level, msg);
        } else {
            System.out.println("Wrong Log level: "+msg);
        }
    }
}
