package com.callor.var;

public class Var_02 {
	
	public static void main(String[] args) {
		
		int intNum1 = 0;
		intNum1 = num1();
		System.out.println(intNum1);
		
		int intNum2 = 0;
		intNum2 = 33;
		intNum2 = intNum1;
		intNum2 = intNum1 + 100;
		
		/*
		 * add(): add method��� �д´�
		 * add()�� ����(run, ����� ����)�Ͽ� �� �����
		 * intNum2�� �����ش޶�
		*/
		intNum2 = add();
	} // end main
	
	/*
	 * add()�� �����ϱ�
	 */
	public static int add() {
		// ���� 55�� 33�� �����Ͽ� return�ϱ�
		return 55 + 33;		
	}
	
	/*
	 * num1()�� �����ϱ�
	 */
	public static int num1() {
		
		return 100;
				
	}

}
