package com.sample.spring.bean;

import org.springframework.stereotype.Component;

@Component("printerB")
public class PrinterB implements Printer{

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println("Printer B: " + message);
		
	}

}
