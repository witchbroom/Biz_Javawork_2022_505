package com.callor.var;

public class Var_04 {
	
	public static void main(String[] args) {
		
		/*
		 * ĳ����
		 * ����(������, ����, �ѱ� 1����, Ư������)�� �����ϴ� ���� type
		 * ���ڸ� ��������ǥ(SQ)�� ���´�
		 * Ű����� �Է��Ҽ��ִ� ���ڸ� �����ϴ� ����
		 */
		char charA = '��';
		char charB = 'A';
		
		System.out.println(charA);
		System.out.println(charB);		
		
		System.out.printf("\t%c\n", charB);
		
		
		/*
		 * charA, charB���� '����'�� ����Ǿ� �ִ�
		 * charA : '��', charB : 'A'�� ����Ǿ� ������
		 * ���� ����� ���� ������ ǥ���� 10������ �ٲپ� �����Ѵ�
		 * ����� 10������ ���������� �ٲپ� ���� ���� Ȯ���� �� �ִ�
		 * 
		 * intA = (int)charA : Unicoe ������ '��' ������ 
		 * ���� ������(�ڵ尪)�� ������ ������ ��ȯ�Ͽ� ����
		 * 
		 * intB = (int)charB : ASCII ������ 'A'������
		 * ���� ������(�ڵ尪)�� ������ ������ ��ȯ�Ͽ� ����
		 */
		int intA = (int)charA;
		int intB = (int)charB;
		
		// ������ ����� ���ڿ� ������ �ڵ尪 (code value)�� Ȯ��
		System.out.printf("\t%c : %d \n", charA, intA);
		System.out.printf("\t%c : %d \n", charB, intB);
		
	}

}
