package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// �Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϱ�
		// ���� �ϳ� �Է����ּ��� : a
		// ���� �빮�� Ȯ�� : false
		
		// ���� �ϳ� �Է����ּ��� : A
		// ���� �빮�� Ȯ�� : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է����ּ��� : ");
		char input = sc.next().charAt(0);
		boolean check = (input >= 'A') && (input <= 'Z');
		System.out.println("���� �빮�� Ȯ�� : " + check);

	}
}
