package com.spirng.polymorphism;

public class TVUser {

	public static void main(String[] args) {
		TV tv = new LgTV();  
		tv.powerOn();
		tv.volumeUp();
		tv.powerOff();
		tv.volumeDown();
		
		/*
		 * 인터페이스형 객체(인스턴스) 생성해서 
		 * 묵시적 형변환(자동형변환)을 이용하여
		 * 객체 참조하면 쉽게 교체 가능
		 */
	}

}
