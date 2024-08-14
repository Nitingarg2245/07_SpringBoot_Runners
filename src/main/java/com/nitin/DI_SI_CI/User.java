package com.nitin.DI_SI_CI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    private Printer printer;

//    @Autowired
//    public User(DotPrinter printer) {//this doesnt need any annotation as by default this contrctor is called by ioc
//        // and object is injected
//        this.printer = printer;
//    }
//
//    @Autowired
//    public void setPrinter(LaserPrinter printer) {
//        this.printer = printer;
//    }

    public void Print(){
        printer.Print();
    }
}
//field injection
//constructor injection
//setter injection
