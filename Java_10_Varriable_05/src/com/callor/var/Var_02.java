package com.callor.var;

public class Var_02 {
	
	public static void main(String[] args) {
		
		double doNum1 = 0;
		double doNum2 = 0;
		
		doNum1 = Math.random() * 1000;
		doNum2 = Math.random() * 1000;
		
		double doSum = doNum1 + doNum2;
		double doDes = doNum1 - doNum2;
		double doMulti = doNum1 * doNum2;
		double doDiv = doNum1 / doNum2;
		
		/*
		 * printf()�� ����Ͽ� 3�� ������ ��� �����͸� Console�� ����ϱ�
		 * "%d + %d = %d" form String�� ����Ͽ� ����� ����� �����ϰ�
		 * ���� %d ��ġ�� ǥ���� �����͸� 3�� �����ߴ�
		 * ���⿡ %d�� Demical(10����)�� ǥ���ϴ� Ű �ܾ��̴�
		 * �׷��� doNum1, doNum2, doSum ������ double type�̴�
		 * double type ������ ��� ���� %d�� ǥ���Ϸ���
		 * ���ο��� ������ type ������ ���� �ߴ��� ������ �߻��Ѵ�
		 * %d�� ������ ǥ���� �� �ִµ� �Ǽ����� ǥ���϶�� �߱⶧���� �߻��ϴ� �����̴�
		 */
		// System.out.printf("\t%d + %d = %d\n", doNum1, doNum2, doSum);
		
		/*
		 * printf() �� ����Ͽ� �Ǽ� �����͸� Console�� ����Ϸ��� %f ��ȣ�� ����Ͽ� ǥ���ؾ� �Ѵ�
		 */
		System.out.printf("\t%f + %f = %f\n", doNum1, doNum2, doSum);
		
		// %.2f : �����κ��� ��� ǥ���ϰ� �Ҽ������� 2°�ڸ����� ����϶�
		System.out.printf("\t%.2f + %.2f = %.2f\n", doNum1, doNum2, doSum);
		
		System.out.println("\t====================");
		System.out.printf("\t%.2f + %.2f = %.2f\n", doNum1, doNum2, doSum);
		System.out.printf("\t%.2f x %.2f = %.2f\n", doNum1, doNum2, doMulti);
		
		/*
		 * %8.2f : ��ü �ڸ����� 8���� �ϰ� �Ҽ������� 2������ ǥ��
		 * ���� �����Ͱ� ��ü �ڸ������� ������ ���� �κ��� �������� ǥ��
		 * ���ڸ� ���������� ������ �� ����ϴ� ���
		 * 8.2 : �����ڸ��� + �Ҽ���(1) + �Ҽ������� 2�ڸ��� ��� ���� ������ 8����� ǥ���̴�
		 * �׷��� ��ü �ڸ����� 8���� �Ѿ�� form�� ��Ʈ������ ��쵵 �ִ�
		 */
		System.out.println("\t====================");
		System.out.printf("\t%.2f + %.2f = %8.2f\n", doNum1, doNum2, doSum);
		System.out.printf("\t%.2f x %.2f = %8.2f\n", doNum1, doNum2, doMulti);
		
	}

}
