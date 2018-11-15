package com.cg.javaObjects;

public class Demo {
	private int a;;
	public int b=10;
	public void seta(int x) {								//SETTER
		a =x;
	}
	public void m1() {										
		m2(a);
	}
	public int m2(int a2) {									//GETTER
		// TODO Auto-generated method stub
		return a2;
	}
}
