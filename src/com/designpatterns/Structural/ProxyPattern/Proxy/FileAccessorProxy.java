package com.designpatterns.Structural.ProxyPattern.Proxy;

import com.designpatterns.Structural.ProxyPattern.SubjectInterface.FileAccessor;
import com.designpatterns.Structural.ProxyPattern.RealSubject.RealFileAccessor;
import java.time.chrono.ThaiBuddhistChronology;

public class FileAccessorProxy implements FileAccessor {
    RealFileAccessor fileAccessor;
    String username;
    String role;

    public FileAccessorProxy(String filename, String username, String role) {
        this.fileAccessor = new RealFileAccessor(filename);
        this.username = username;
        this.role = role;
    }

    public void readFile() {
        System.out.println("\n" + username + " trying to read the file");
        fileAccessor.readFile();
    }

    public void writeFile() {
        System.out.println("\n" + username + " trying to wrting into the file");
        if(role.equals("ADMIN")) {
            // System.out.println("\n" + username + " wrting into the file");
            fileAccessor.writeFile();
        } else {
            System.out.println(username + " can't write into the file as admin can write into file");
        }
    }
}