package com.callor.var;

public class Var_05 {
	
	public static void main(String[] args) {
		
		// �⺻ �Ǽ�Ÿ��(�Ҽ��� ���� 13�ڸ�)
		double douNum = 30; // 30.0�� ����ȴ�.
		int intNum = (int)douNum; // �Ǽ��� ���� �������� ������ ����
		
		// �Ǽ�Ÿ���� ������ �ʿ��ϱ�� �ѵ�
		// ���� �Ҽ��� ���� 13�ڸ������� ���е��� �ʿ���� ���
		float foNum = 30;
		
		// float ���� double ������ ���е��� ���� �Ǽ��� ������
		foNum = (float)Math.random();
		System.out.println(foNum);
	}

}
