package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); // Scanner 클래스가 있는데
												//TestScanner에서 사용할거야
		System.out.print("int 값을 입력해주세요 : "); // print는 개행을 하지 않음
		int input1 = sc.nextInt();
		
		System.out.print("int 두번째값을 입력해주세요 : ");
		int input2 = sc.nextInt();
		
		System.out.println("입력한 값은 : " + input1);
		System.out.println("입력한 두번째 값은 : " + input2);
		
		int result = input1 + input2;
		System.out.println("두 값의 합은 : " + result + "입니다.");
	}
}
