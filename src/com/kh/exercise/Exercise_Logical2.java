package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// 입력한 문자 값이 대문자인지 확인하여 결과 출력하기
		// 문자 하나 입력해주세요 : a
		// 영어 대문자 확인 : false
		
		// 문자 하나 입력해주세요 : A
		// 영어 대문자 확인 : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력해주세요 : ");
		char input = sc.next().charAt(0);
		boolean check = (input >= 'A') && (input <= 'Z');
		System.out.println("영어 대문자 확인 : " + check);

	}
}
