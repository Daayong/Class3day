package com.iu.s2;

import java.util.Scanner;

public class ForTest1 {
 public static void main(String [] args) {
	 System.out.println("===Test1 Start===");
	
	 /*
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("반복할 횟수를 입력하시오");
	
	 int count = sc.nextInt();
	 int num = 0;
	 
	for(int i=0; i<count; i=i+1) {
		System.out.println("Hello "+ num);
		num=num+1;
	}
	*/
	
	//위에 for문 안에 작성되어 있는 int i=0;은 지역변수 이므로 for문 종료시 사라짐
	
	//0~20 사이에 짝수만 출력해주세요
	

	for(int i=0; i<21; i=i+2) {	
		System.out.println(i);
	}
	
	
	
	
	 
	 System.out.println("===Test1 Finish===");
 }
}












