package com.iu.s2;

public class ForTest2 {

	public static void main(String [] args) {
		System.out.println("===For Test2 Start===");
		
		int num=0;
		
		++num;
		System.out.println(num);
		
		num++;
		System.out.println(num);
		
	
		int check1 = ++num;
		System.out.println("Num : "+num);
		System.out.println("check1 : "+check1);
		
		check1 = num++;
		System.out.println("Num : "+num); //4
		System.out.println("check1 : "+check1);  //3
		
		System.out.println(++num);  //5
		System.out.println(num++);  //5
		System.out.println(num); //6 
		
		System.out.println("===For Test2 Finish===");
	}
}
