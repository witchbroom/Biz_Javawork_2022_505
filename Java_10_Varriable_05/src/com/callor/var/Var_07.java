package com.callor.var;

public class Var_07 {
	
	public static void main(String[] args) {
		
		int intNum = (int)(Math.random() * 1000) + 10;
		int intANS = 33;
		
		/*
		 * Logic Algebra(�񱳿���), boolean ����
		 * intNum�� ��� ���� ���õ� ������ ũ�ų�, ���� ���� �Ǵ��ϴ� ����
		 */
		System.out.println("\t" + intNum);
		System.out.println("\t" + (intNum > intANS));
		System.out.println("\t" + (intNum <= 99));
		// == : ~���� �ƴ��� �˻��ض�
		// intNum % 2 == 0 : intNum�� 2�� ���� �������� 0���� �˻��ض�
		System.out.println("\t" + ((intNum % 2) == 0));
		
		// ������� = �����
		// �񱳿��� = True/False
	}

}
