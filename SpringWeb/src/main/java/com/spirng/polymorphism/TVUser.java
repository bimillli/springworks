package com.spirng.polymorphism;

public class TVUser {

	public static void main(String[] args) {
		TV tv = new LgTV();  
		tv.powerOn();
		tv.volumeUp();
		tv.powerOff();
		tv.volumeDown();
		
		/*
		 * �������̽��� ��ü(�ν��Ͻ�) �����ؼ� 
		 * ������ ����ȯ(�ڵ�����ȯ)�� �̿��Ͽ�
		 * ��ü �����ϸ� ���� ��ü ����
		 */
	}

}
