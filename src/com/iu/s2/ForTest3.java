package com.iu.s2;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String [] args) {
		System.out.println("===ForTest3 Start===");
		
		//종료 시간 입력받기
		//단, 60 상수는 변경 불가능
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 초시간을 입력하시오");
		
		int push = sc.nextInt();
		
		for(int sec=0; sec<60; sec++) {
			
			System.out.println(sec+"초"); 
			
			if(sec==push) {
				sec=60;
			}
		}
		
		
		System.out.println("===ForTest3 Finish===");
	}
}
