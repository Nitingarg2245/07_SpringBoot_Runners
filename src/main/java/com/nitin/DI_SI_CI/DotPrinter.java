package com.nitin.DI_SI_CI;


import org.springframework.stereotype.Component;

import java.nio.Buffer;
import java.util.Scanner;

@Component
public class DotPrinter implements Printer {
    @Override
    public void Print() {
        System.out.println("Dot printer is printing");
        Scanner scanner = new Scanner(System.in);

    }

}
