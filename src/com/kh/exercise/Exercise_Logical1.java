package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		// �Է��� �������� 1 ~ 100 ������ �������� Ȯ���Ͻÿ�
		// ������ �ϳ� �Է����ּ��� : 33
		// 1���� 100������ �����ΰ�? : true
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ϳ� �Է����ּ��� : ");
		int num = sc.nextInt();		
		boolean isTrue = (num > 1) && (num < 100);
		System.out.println("1���� 100������ �����ΰ�? : " + isTrue);
		//���׿�����
		//String isResult = (num > 1) && (num < 100) ? "true" : "false";
		//System.out.println("1���� 100������ �����ΰ�? : " + isResult);
	}
}
