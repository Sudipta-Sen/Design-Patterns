package com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    protected void log(int level, String msg) {
        if(level == ERROR) {
            System.out.println("ErrorLog: "+msg);
        } else {
            super.log(level, msg);
        }
    }
}
