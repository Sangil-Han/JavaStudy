package com.kh.exscanner;

import java.util.Scanner;


public class TestScanner3 {
	public static void main(String [] args) {
//		이름을 입력해주세요.
//		민봉식
//		태어난 월을 입력해주세요.
//		9
//		키를 입력해주세요.
//		180
//		성별을 입력해주세요.
//		남
//		주소를 입력해주세요. //nextLine()
//		서울시 종로구
//		이름은 민봉식입니다.
//		태어난 월은 9입니다.
//		키는 180.0입니다.
//		성별은남입니다.
//		주소는 서울시 종로구입니다
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();	
		System.out.print("태어난 월을 입력해주세요 : ");
		int birthMonth = sc.nextInt();	
		System.out.print("키를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("성별을 입력해주세요 : ");
		char gender = sc.next().charAt(0);
		System.out.print("주소를 입력해주세요 : ");
		sc.nextLine(); //입력되었던 엔터값을 받은 후 nextLine 쓰려면 두번 써야함
		String address = sc.nextLine(); // 주소를 입력받음
		//next(), nextLine() 둘다 문자열을 입력받음
		//nextLine()은 공백을 입력받음
		
		System.out.println();
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + birthMonth + "월 입니다.");
		System.out.println("키는 " + height + "입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("주소는 " + address + "입니다.");
	}
}
