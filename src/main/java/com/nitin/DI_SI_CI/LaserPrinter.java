package com.nitin.DI_SI_CI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LaserPrinter implements Printer{
    @Override
    public void Print() {
        System.out.println("Laser printer is printing");
    }
}
