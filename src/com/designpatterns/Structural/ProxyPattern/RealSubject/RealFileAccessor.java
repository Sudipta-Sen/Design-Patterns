package com.designpatterns.Structural.ProxyPattern.RealSubject;

import com.designpatterns.Structural.ProxyPattern.SubjectInterface.FileAccessor;

public class RealFileAccessor implements FileAccessor {
    private String filename;

    public RealFileAccessor(String filename) {
        this.filename = filename;
    }

    @Override
    public void readFile() {
        System.out.println("Reading file "+filename);
    }

    @Override
    public void writeFile() {
        System.out.println("Writing into file "+filename);
    }
}