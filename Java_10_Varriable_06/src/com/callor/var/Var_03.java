package com.callor.var;

public class Var_03 {
	
	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() * 100) + 1;
		
		// boolean type�� ���� �ʱ�ȭ�Ҷ���  true���� �ַ� ����Ѵ�
		boolean bEven = true;
		
		bEven = (intNum1 % 2) == 0;
		
		/*
		 * ��(����)��ɹ�
		 * if(boolean){ boolean�� true�϶� ���� } 
		 * else{ boolean�� true�� �ƴҶ� ���� }
		 * boolean�� ���� true�ΰ� false�ΰ��� ���� ��ɹ��� ���������� ������ �� �ִ�
		 */
		if(bEven) {
			System.out.println(intNum1 + "�� ¦��");
		} else {
			System.out.println(intNum1 + "�� ¦���� �ƴϴ�");
		}
		
		// ��������� if ��ɹ� ����
		// �������� true �Ǵ� false�� ���
		if((intNum1 % 3) == 0) {
			System.out.println(intNum1 + "�� 3�� ���");
		} else {
			System.out.println(intNum1 + "�� 3�� ����� �ƴϴ�");
		}
		
		if ((intNum1 % 4) == 0) {
			System.out.println(intNum1 + "�� 4�� ���");
		} else if((intNum1 % 3) == 0) {
			System.out.println(intNum1 + "�� 4�� ����� �ƴϴ�");
			System.out.println("������ 3�� ����̴�");
		} else if ((intNum1 % 2) == 0) {
			System.out.println(intNum1 + "�� 4�� ��� �ƴ�");
			System.out.println("3�� ����� �ƴ�");
			System.out.println("�׷��� 2�� ����� �� ����");
		}
	}

}
