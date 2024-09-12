package com.designpatterns.Structural.ProxyPattern;

import com.designpatterns.Structural.ProxyPattern.Proxy.FileAccessorProxy;
import com.designpatterns.Structural.ProxyPattern.SubjectInterface.FileAccessor;

public class client {
    public static void main(String[] args) {
        FileAccessor guestAccess = new FileAccessorProxy("SampleFile.txt", "sudipta", "guest");
        guestAccess.readFile();
        guestAccess.writeFile();

        FileAccessor adminAccess = new FileAccessorProxy("SampleFile.txt", "shreya", "ADMIN");
        adminAccess.readFile();
        adminAccess.writeFile();
    }
}