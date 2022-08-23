package com.spirng.polymorphism;

public interface TV {
	//추상 메소드(블록{} 없이 선언만 되있음)
	public void powerOn();
	public void powerOff();
	public void volumeUp();
	public void volumeDown();
	
	/*
	 * 결합도를 약간 낮춤(코드 수정을 조금 덜 할 수 있게)
	 * 모든 TV 클래스가 같은 메소드들을 가질 수 밖에 없도록 강제할 수 있음  
	 */
}
