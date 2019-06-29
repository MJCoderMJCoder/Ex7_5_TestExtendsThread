package com.test;

public class TestExtendsThread {

	public static void main(String[] args) {
		Master master = new Master("ÈçÀ´");
		master.start();
		Student student = new Student("ËïÎò¿Õ");
		student.start();

	}

}