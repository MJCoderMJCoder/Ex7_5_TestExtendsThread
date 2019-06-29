package com.test;

class Master extends Student {
	Master(String Name) {
		super(Name);	//调用父类构造方法，显式调用
	}
	
	public void printInformation() {	//覆盖父类的方法，实现特定的功能
		System.out.println("我是一名研究生！我叫" + this.Name);
	}
}
