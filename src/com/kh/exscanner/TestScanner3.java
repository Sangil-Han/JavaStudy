package com.kh.exscanner;

import java.util.Scanner;


public class TestScanner3 {
	public static void main(String [] args) {
//		�̸��� �Է����ּ���.
//		�κ���
//		�¾ ���� �Է����ּ���.
//		9
//		Ű�� �Է����ּ���.
//		180
//		������ �Է����ּ���.
//		��
//		�ּҸ� �Է����ּ���. //nextLine()
//		����� ���α�
//		�̸��� �κ����Դϴ�.
//		�¾ ���� 9�Դϴ�.
//		Ű�� 180.0�Դϴ�.
//		���������Դϴ�.
//		�ּҴ� ����� ���α��Դϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = sc.next();	
		System.out.print("�¾ ���� �Է����ּ��� : ");
		int birthMonth = sc.nextInt();	
		System.out.print("Ű�� �Է����ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������ �Է����ּ��� : ");
		char gender = sc.next().charAt(0);
		System.out.print("�ּҸ� �Է����ּ��� : ");
		sc.nextLine(); //�ԷµǾ��� ���Ͱ��� ���� �� nextLine ������ �ι� �����
		String address = sc.nextLine(); // �ּҸ� �Է¹���
		//next(), nextLine() �Ѵ� ���ڿ��� �Է¹���
		//nextLine()�� ������ �Է¹���
		
		System.out.println();
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("�¾ ���� " + birthMonth + "�� �Դϴ�.");
		System.out.println("Ű�� " + height + "�Դϴ�.");
		System.out.println("������ " + gender + "�Դϴ�.");
		System.out.println("�ּҴ� " + address + "�Դϴ�.");
	}
}
