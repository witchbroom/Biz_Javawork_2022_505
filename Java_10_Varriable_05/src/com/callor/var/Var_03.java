package com.callor.var;

public class Var_03 {
	
	public static void main(String[] args) {
		
		double doNum1 = 0;
		double doNum2 = 0;
		
		doNum1 =  Math.random() * 1000+1;
		doNum2 =  Math.random() * 1000+1;
		
		double doSum = doNum1 + doNum2;
		double doMinus = doNum1 - doNum2;
		double doMulti = doNum1 * doNum2;
		double doDiv = doNum1 / doNum2;
				
		
		System.out.printf("\t%f + %f = %f\n", doNum1, doNum2, doSum);
		System.out.printf("\t%f - %f = %f\n", doNum1, doNum2, doMinus);
		System.out.printf("\t%f * %f = %f\n", doNum1, doNum2, doMulti);
		System.out.printf("\t%f / %f = %f\n", doNum1, doNum2, doDiv);	
		
		
		// doNum1 : 0.0000 ~ 0.999 ������ �Ǽ��� �����Ǿ� ����
		/*
		 * Math.random() �� ����� ����� ��� doNum1 ������ ����
		 * 1000�� ���Ͽ� �ٽ� doNum1�� �����϶�
		 * doNum1 = doNum1 * 1000;�� ����
		 * doNum1 : 0.000 ~ 999.999 ������ �Ǽ��� ����
		 */
		doNum1 *= 1000;
		
		/*
		 * doNum1�� ��� ���� 1�� ���Ͽ� �ٽ� doNum1�� ����
		 * doNum1 : 1.000 ~ 1000.999 ������ �Ǽ��� ����
		 */
		doNum1 ++;
		
		// ���������� ��ȯ
		// intNum1 : 1 ~ 1000 ������ ������ ����
		int intNum1 = (int)doNum1;
		
		
	}

}
