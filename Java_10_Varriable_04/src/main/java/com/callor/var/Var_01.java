package com.callor.var;

public class Var_01 {
	
	public static void main(String[] args) {
		
		// ������ �����ϰ� clear (0�� ����, ����)
		int intNum1 = 0;
		int intNum2 = 0;
		
		// ������ �� �����ϱ�
		// ������ � ���� �����ϸ� �̹� ����� ���� ������ �������
		intNum1 = 33;
		intNum2 = 55;
		
		// ��Ģ���� ����� ����(����)�ϱ����� ���� ���� clear
		// intNum1, intNum2 ������ ��� ���� �о�ͼ�
		// ��Ģ������ ������ �� ������ ������ �����ϱ�
		int intPlus = intNum1 + intNum2;
		int intMinus = intNum1 - intNum2;
		int intMul = intNum1 * intNum2;
		int intDiv = intNum1 / intNum2;
		
		// ȭ�鿡 form�� ���� �� ����ϱ�
		System.out.printf("\t%d + %d = %d", intNum1, intNum2, intPlus);
		System.out.printf("\t%d - %d = %d", intNum1, intNum2, intMinus);
		System.out.printf("\t%d * %d = %d", intNum1, intNum2, intMul);
		System.out.printf("\t%d / %d = %d", intNum1, intNum2, intDiv);		
		
	}

}
