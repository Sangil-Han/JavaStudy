package com.kh.variable;

public class TestVarExam {
	public static void main(String [] args) {
		//자료형별 변수를 만들고 -> int num, char moonja, boolean result
		//초기화 한 후 -> num =1;, moonja = 'A', result = false
		//그 값을 출력 -> System.out.println();
		int iNum = 100; //선언과 초기화 같이 하고 있음
		long lNum = 999999999999l;
		float fNum = 486.520f;
		double dNum = 567.890123;
		char fChar = 'A';
		String fStr = "Hello World";
		boolean result = false;
		
		System.out.println("정수의 값 : " + iNum);
		System.out.println("정수의 값(9999억) : " + lNum);
		System.out.println("실수의 값 : " + fNum);
		System.out.println("실수의 값 : " + dNum);
		System.out.println("문자의 값 : " + fChar);
		System.out.println("문자열의 값 : " + fStr);
		System.out.println("논리의 값 : " + result);
		
		System.out.println('1'+'1');
		System.out.println("1"+"1");
		
		System.out.println("Hello" + 3.14);
		System.out.println(10 + (20 + "Hello"));
	}
}
