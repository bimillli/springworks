package com.spirng.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVuserTest {

	public static void main(String[] args) {
		//1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�.
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		
		//3. Spring �����̳� ����
		factory.close();
	}

}
