package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple1 {
	// �Է¹��� ������ ���, 0, �������� �Ǻ� �� ����ϼ���..
	// �ʹ� ������ ���, ���� �Ǻ����� �غ�����
	// ������ �Է����ּ��� : -1
	// -1��/�� �����Դϴ�.

	// ������ �Է����ּ��� : 1
	// 1��/�� ����Դϴ�.

	// ������ �Է����ּ��� : 0
	// 0��/�� 0�Դϴ�.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int value = sc.nextInt();
		String resultStr = value == 0 ? "0�Դϴ�." : value > 0 ? "����Դϴ�." : "�����Դϴ�.";
		System.out.println(value + "��/�� " + resultStr);
		
	}
}
