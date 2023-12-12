package com.Xworkz.SpringBeginning.AirportMngt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirportTester {

    public static void main(String[] args) {
        ApplicationContext  context = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");
        AirportDTO airportDTO = context.getBean(AirportDTO.class);
        TerminalDTO terminalDTO = context.getBean(TerminalDTO.class);

        System.out.println(airportDTO);
    }
}
