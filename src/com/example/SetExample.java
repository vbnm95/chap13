package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetExample {

	public static void main(String[] args) {
		var r = new Random();
		var set = new HashSet<Integer>();
		var count = 0;
		
		while(true) {
			int num = r.nextInt(1, 11);
			
			set.add(num);
			count++;
			if(set.size() == 10) {
				break;
			}
			
		}
		
		System.out.println(set);
		System.out.println(count);
	}
	
	public static void main2(String[] args) {
		var list = new ArrayList<Integer>();
		var set = new HashSet<Integer>();
		
		for(int i=0; i<4; i++) {
			System.out.println(list.add(1));
			System.out.println(set.add(1));
		}
		
		System.out.println(list);
		System.out.println(set);
	}
}
