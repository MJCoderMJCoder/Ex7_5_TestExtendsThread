package com.test;

public class TestExtendsThread {

	public static void main(String[] args) {
		Master master = new Master("����");
		master.start();
		Student student = new Student("�����");
		student.start();

	}

}