package com.sample.spring.tv2;

public class TvUser {

	public static void main(String[] args) {
	    LgTv tv1 = new LgTv();	
	    SamsungTv tv2 = new SamsungTv();
		
	    tv1.turnOn();
	    tv1.turnOff();
	    tv1.soundUp();
	    tv1.soundDown();
	    
	    tv2.turnOn();
	    tv2.turnOff();
	    tv2.soundUp();
	    tv2.soundDown();

	}

}
