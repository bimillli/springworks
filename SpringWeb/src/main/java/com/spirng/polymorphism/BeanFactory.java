package com.spirng.polymorphism;

public class BeanFactory {
	
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
		
		
		 //getBean() �޼ҵ�� �Ű������� ���� beanName�� �ش�Ǵ�
		 //��ü�� �����Ͽ� �����Ѵ�.
		 
	}
}
