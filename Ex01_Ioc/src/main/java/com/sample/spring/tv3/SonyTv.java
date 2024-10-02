package com.sample.spring.tv3;

public class SonyTv implements Tv{
	public SonyTv() {
		System.out.println("===>SonyTv");
	}
	@Override
	public void turnOn() {
		System.out.println("SonyTv 전원킨다");
	}
	@Override
	public void turnOff() {
		System.out.println("SonyTv 전원끈다");
	}
	@Override
	public void soundUp() {
		System.out.println("SonyTv 소리킨다");
	}
	@Override
	public void soundDown() {
		System.out.println("SonyTv 소리끈다");
	}

}
