package com.test;

class Master extends Student {
	Master(String Name) {
		super(Name);	//���ø��๹�췽������ʽ����
	}
	
	public void printInformation() {	//���Ǹ���ķ�����ʵ���ض��Ĺ���
		System.out.println("����һ���о������ҽ�" + this.Name);
	}
}
