package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple1 {
	// 입력받은 정수가 양수, 0, 음수인지 판별 후 출력하세요..
	// 너무 어려우면 양수, 음수 판별부터 해보세요
	// 정수를 입력해주세요 : -1
	// -1은/는 음수입니다.

	// 정수를 입력해주세요 : 1
	// 1은/는 양수입니다.

	// 정수를 입력해주세요 : 0
	// 0은/는 0입니다.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int value = sc.nextInt();
		String resultStr = value == 0 ? "0입니다." : value > 0 ? "양수입니다." : "음수입니다.";
		System.out.println(value + "은/는 " + resultStr);
		
	}
}
