package com.callor.var;

public class Var_01 {
	
	public static void main(String[] args) {
		
		// 1~ 1000���� ���� �� ���� �� 1���� �����Ͽ� intNum1 ����
		int intNum1 = (int)(Math.random() * 1000) + 1;
		int intNum2 = (int)(Math.random() * 1000) + 1;
		
		System.out.printf("\tintNum1 : %d\n", intNum1);
		System.out.printf("\tintNum2 : %d\n", intNum2);
		
		System.out.println("\t num1 > num2 " + (intNum1 > intNum2));
		System.out.println("\t num1 < num2 " + (intNum1 < intNum2));
		System.out.println("\t num1 == num2 " + (intNum1 == intNum2));
		
		/*
		 * �ΰ��� �񱳴��(intNum1, intNum2)�� ��� ����
		 * ��Ȯ�� ��ġ���� ������ true,
		 * �ΰ��� �񱳴���� ���� �ʳ�? ��� ���´�
		 */
		System.out.println("\t num1 <> num2 " + (intNum1 != intNum2));
		
		/*
		 * Literal(���ͷ�): ���� ��Ȯ�� Ȯ���� �� �ִ� ��
		 * �Ϲ����� ���ڰ� "���ڿ�"
		 * Java���� ���ͷ��� ���ͷ��� �񱳿����ϴ°��� ���� �ǹ̰� ����
		 * ������ Eclipse���� ���� �Ǵ� ��� �����ش�
		 */
		System.out.println(30 == 30);
		System.out.println(30 > 30);
	}

}
