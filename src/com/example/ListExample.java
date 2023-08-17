package com.example;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {
	//var field;
	
	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		System.out.println(list);
		System.out.println(list.size());
		list.add(0, 30);
		System.out.println(list);
		list.set(1, 70);
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(1);
		System.out.println(list);
		list.remove(Integer.valueOf(20));
		System.out.println(list);
		System.out.println(String.valueOf(30).getClass());
		System.out.println((Integer.valueOf(20).getClass()));
	}
	
	public static void main4(String[] args) {
		var num = 100;
		var pi = 3.14;
		var msg = "Help";
		
		var li1 = new ArrayList<Integer>();
		var li2 = new Vector<Integer>();
		var li3 = new LinkedList<Integer>();
		
	}
	
	public static void main3(String[] args) {
		List<Integer> li1 = new ArrayList<Integer>();
		List<Integer> li2 = new Vector<Integer>();
		List<Integer> li3 = new LinkedList<Integer>();
		
		for(int i=0; i<10; i++ ) {
			li1.add(i);
		}
		
		System.out.println(li1.size());
		
		for(int i:li1) {
			System.out.println(i);
		}
	}
	
	public static void main2(String[] args) {
		ArrayList<Integer> li1 = new ArrayList<Integer>();
		Vector<Integer> li2 = new Vector<Integer>();
		LinkedList<Integer> li3 = new LinkedList<Integer>();
	}
}
