package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); // Scanner Ŭ������ �ִµ�
												//TestScanner���� ����Ұž�
		System.out.print("int ���� �Է����ּ��� : "); // print�� ������ ���� ����
		int input1 = sc.nextInt();
		
		System.out.print("int �ι�°���� �Է����ּ��� : ");
		int input2 = sc.nextInt();
		
		System.out.println("�Է��� ���� : " + input1);
		System.out.println("�Է��� �ι�° ���� : " + input2);
		
		int result = input1 + input2;
		System.out.println("�� ���� ���� : " + result + "�Դϴ�.");
	}
}
