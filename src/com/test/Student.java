package com.test;

class Student extends Thread {
	String Name;
	
	public Student(String Name) {	//构造方法
		this.Name = Name;
	}
	
	public void printInformation() {
		System.out.println("我是一名大学生！我叫" + this.Name);
	}
	
	public void run() {
		printInformation();
	}
}
