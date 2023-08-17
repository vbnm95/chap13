package com.example;

public class ObjectExample {

	static class A {
		
	}
	
	static class B extends A {
	
	}
	
	public static void main(String[] args) {
		Object o = new Object();
		A a = new A();
		B b = new B();
		Integer i = 10;
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		System.out.println(i.toString());
	}
}
