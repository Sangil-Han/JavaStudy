package com.kh.variable;

public class TestVarExam {
	public static void main(String [] args) {
		//�ڷ����� ������ ����� -> int num, char moonja, boolean result
		//�ʱ�ȭ �� �� -> num =1;, moonja = 'A', result = false
		//�� ���� ��� -> System.out.println();
		int iNum = 100; //����� �ʱ�ȭ ���� �ϰ� ����
		long lNum = 999999999999l;
		float fNum = 486.520f;
		double dNum = 567.890123;
		char fChar = 'A';
		String fStr = "Hello World";
		boolean result = false;
		
		System.out.println("������ �� : " + iNum);
		System.out.println("������ ��(9999��) : " + lNum);
		System.out.println("�Ǽ��� �� : " + fNum);
		System.out.println("�Ǽ��� �� : " + dNum);
		System.out.println("������ �� : " + fChar);
		System.out.println("���ڿ��� �� : " + fStr);
		System.out.println("���� �� : " + result);
		
		System.out.println('1'+'1');
		System.out.println("1"+"1");
		
		System.out.println("Hello" + 3.14);
		System.out.println(10 + (20 + "Hello"));
	}
}
