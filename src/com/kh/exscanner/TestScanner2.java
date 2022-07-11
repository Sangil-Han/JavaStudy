package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		//입력받은 것 중에서 정수를 입력받았습니다.
		//실수, 문자, 문자열
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int iNum = sc.nextInt();
		
		System.out.print("실수를 입력해주세요 : ");
		double dNum = sc.nextDouble();
		
		System.out.print("문자열을 입력해주세요 : ");
		String inputStr = sc.next(); // nextLine() 문자열을 받는데 차이가있음
		
		System.out.print("문자를 입력해주세요 : ");
		char inputChar = sc.next().charAt(0); // nextChar() 없음
		
		System.out.println("입력한 정수는 : " + iNum);
		System.out.println("입력한 실수는 : " + dNum);
		System.out.println("입력한 문자는 : " + inputChar);
		System.out.println("입력한 문자열은 : " + inputStr);
		
	}
}
