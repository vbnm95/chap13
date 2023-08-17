package com.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformenceExample {

	public static void main(String[] args) {
		var li1 = new ArrayList<Integer>();
		var li2 = new LinkedList<Integer>();
		var ea = 200_000;
		
		// ArrayList
		var start1 = LocalTime.now();
		for(int i=0; i<ea; i++) {
			li1.add(i);
			
		}
		var end1 = LocalTime.now();
		
		System.out.println("ArrayList add : " + Duration.between(start1, end1));
		//System.out.println(li1.size());
		
		start1 = LocalTime.now();
		for(int i=0; i<ea; i++) {
			li1.get(i);
			
		}
		end1 = LocalTime.now();
		
		System.out.println("ArrayList get : " + Duration.between(start1, end1));
		
		start1 = LocalTime.now();
		for(int i=0; i<ea; i++) {
			li1.set(i,i);
			
		}
		end1 = LocalTime.now();
		
		System.out.println("ArrayList set : " + Duration.between(start1, end1));
		
		start1 = LocalTime.now();
		for(int i=0; i<li1.size(); i++) {
			li1.remove(i);
			
		}
		end1 = LocalTime.now();
		
		System.out.println("ArrayList remove : " + Duration.between(start1, end1));
		
		
		// LinkedList
		var start2 = LocalTime.now();
		for(int i=0; i<ea; i++) {
			li2.add(i);
			
		}
		var end2 = LocalTime.now();
		
		System.out.println("LinkedList add : " + Duration.between(start2, end2));
		//System.out.println(li2.size());
		
		start2 = LocalTime.now();
		for(int i=0; i<ea; i++) {
			li2.get(i);
			
		}
		end2 = LocalTime.now();
		
		System.out.println("LinkedList get : " + Duration.between(start2, end2));
		start2 = LocalTime.now();
		for(int i=0; i<ea; i++) {
			li2.set(i,i);
			
		}
		end2 = LocalTime.now();
		
		System.out.println("LinkedList set : " + Duration.between(start2, end2));
		
		start2 = LocalTime.now();
		for(int i=0; i<li2.size(); i++) {
			li2.remove(i);
			
		}
		end2 = LocalTime.now();
		
		System.out.println("LinkedList remove : " + Duration.between(start2, end2));
		
	}
}
