package com.callor.var;

public class Var_03 {
	
	public static void main(String[] args) {
		
		int result = add();
		System.out.println(result);
	}
	
	/*
	 * add()�� �����ϱ�
	 * add()�� num1, num2, intSum ������ ���� �����ϰ�
	 * num1, num2�� ���� 99�� 3�� �����ϰ�
	 * num1, num2�� ����� ���� �о ������ �����Ͽ�
	 * intSum�� �����ϰ�
	 * intSum�� ����� ���� �о return �϶�
	 */
	public static int add() {
		
		int num1 = 99;
		int num2 = 3;
		int intSum= num1 + num2;
		// intSum ������ ����� ���� return �϶�
		// intSum ������ return �϶�°��� �ƴϴ�
		return intSum;
		
	}
	
}
