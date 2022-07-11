package com.kh.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("논리 연산자 예제");
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4;
		result1 = (a != b) && (a < b);
		result2 = (a < b) || (a == b);
		result3 = (a > b) && (a != b);
		result4 = (a > b) || ( a == b);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println();
		System.out.println("논리 연산자 예제2");//and -> && , or -> ||
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100);
		result2 = (aNum < bNum) && (bNum-- < aNum++);
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("a의 값 : " + aNum);
		System.out.println("b의 값 : " + bNum);
	}
}
