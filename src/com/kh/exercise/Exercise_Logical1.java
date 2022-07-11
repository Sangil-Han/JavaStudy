package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		// 입력한 정수값이 1 ~ 100 사이의 숫자인지 확인하시오
		// 정수를 하나 입력해주세요 : 33
		// 1부터 100사이의 숫자인가? : true
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력해주세요 : ");
		int num = sc.nextInt();		
		boolean isTrue = (num > 1) && (num < 100);
		System.out.println("1부터 100사이의 숫자인가? : " + isTrue);
		//삼항연산자
		//String isResult = (num > 1) && (num < 100) ? "true" : "false";
		//System.out.println("1부터 100사이의 숫자인가? : " + isResult);
	}
}
