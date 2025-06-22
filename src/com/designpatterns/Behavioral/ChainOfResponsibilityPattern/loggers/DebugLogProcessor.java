package com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    protected void log(int level, String msg) {
        if(level == DEBUG) {
            System.out.println("DebugLog: "+msg);
        } else {
            super.log(level, msg);
        }
    }
}
