package com.test;

class Student extends Thread {
	String Name;
	
	public Student(String Name) {	//���췽��
		this.Name = Name;
	}
	
	public void printInformation() {
		System.out.println("����һ����ѧ�����ҽ�" + this.Name);
	}
	
	public void run() {
		printInformation();
	}
}
