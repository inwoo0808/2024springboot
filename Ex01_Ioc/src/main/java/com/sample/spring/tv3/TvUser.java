package com.sample.spring.tv3;

public class TvUser {

	public static void main(String[] args) {
	    BeanContainer container = new BeanContainer();
	    
	    LgTv lgTv = (LgTv) container.getBean("lg");
	    SamsungTv samsungTv = (SamsungTv) container.getBean("samsung");
	    SonyTv sonyTv = (SonyTv) container.getBean("sony");
		
	    Tv tv = (Tv) container.getBean(args[0]);
	    
	    lgTv.turnOn();
	    lgTv.turnOff();
	    lgTv.soundUp();
	    lgTv.soundDown();
	    
	    samsungTv.turnOn();
	    samsungTv.turnOff();
	    samsungTv.soundUp();
	    samsungTv.soundDown();
	    
	    sonyTv.turnOn();
	    sonyTv.turnOff();
	    sonyTv.soundUp();
	    sonyTv.soundDown();
	    
	    tv.turnOn();
	    tv.turnOff();
	    tv.soundUp();
	    tv.soundDown();

	}

}
