package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

public class ListRandomExample {

	public static void main(String[] args) {
		//var list = new ArrayList<Integer>();
		//var list = new Vector<Integer>();
		var list = new LinkedList<Integer>();
		
		Random r = new Random();
		
		int count = 0;
		while(true) {
			int ranNum = r.nextInt(1, 101);
			
			if(!list.contains(ranNum)) {
				list.add(ranNum);
			}
			
			count++;
			if(list.size()==100)
				break;
		}
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1 ;
			}
		});
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("count =" + count);
	}
}
