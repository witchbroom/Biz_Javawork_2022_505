package com.callor.var;

public class Var_02 {
	
	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() * 10) + 1;
		int intNum2 = (int)(Math.random() * 10) + 1;
		
		/*
		 * boolean type ���� �����ϰ�
		 * intNum1 �� intNum2 �� ���� ��(>=)�Ͽ� ��Ÿ���� ���(true/false)�� ������ ����
		 */
		boolean bYes = intNum1 >= intNum2;
		System.out.println(bYes);
		
		/*
		 * �������� �񱳿����� �Բ� �����ϴ� �����(expression)
		 * 1. intNum1 % 2�� ����ǰ�
		 * 2. �� ����� 0�� ������ �񱳿����� �����Ѵ�
		 * 3. ���������� �񱳿��� ����� bEven ������ ����
		 * �� ������� ��������� ���� bEven�� ���� intNum1�� ¦���̸� true, �ƴϸ� false
		 */
		boolean bEven = (intNum1 % 2) == 0;
		
		/*
		 * intNum1�� ����� ���� 3�� ����ΰ�?
		 * drainge3�� ��� ���� true�̸� �翬�� 3�� ����̴�
		 * ��� ���� false�̸� �� ����� ǥ���ϴµ� ����� ������� �ִ�
		 * �׷��� ���⿡���� 3�� ����� �ƴϴ� ��� ǥ���Ѵ�
		 */
		boolean drainge3 = (intNum1 % 3) == 0;		
		
	}

}
