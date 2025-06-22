package com.designpatterns.Behavioral.ChainOfResponsibilityPattern.loggers;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    protected void log(int level, String msg) {
        if ( level == INFO) {
            System.out.println("InfoLog: "+msg);
        } else {
            super.log(level, msg);
        }
    }
}
