package com.callor.var;

public class Var_05 {
	
	public static void main(String[] args) {
		
		/*
		 * String type �Ǵ� ���ڿ��� ���� ����
		 * = "" : ����� ���ڿ��� ������ clear(���������� 0�� �����ϴ°Ͱ� ����)
		 */
		String strNation = "";
		
		// = null : ����� ���ڿ��� ������ clear
		String strName = null;
		
		
		/*
		 * 1. strNation �̶�� ������ ����� ���� ������´�
		 * 2. (���������� ������)� ���� ���ѹα� ���ڿ��� �����ġ 1���� �ѱ��ھ� ������ �����Ѵ�
		 * 3. ���� '��'�� ����� �����ġ�� �ּҸ�
		 * 4. strNation ������ ������ �д�
		 */
		strNation = "���ѹα�";
		strName = "ȫ�浿";
		
		/*
		 * 1. strNation ������ ����� ���� �д´�
		 * 2. �� ���� �׳� �����Ͱ� �ƴϰ� �ٸ� �������� �ּҶ�� ǥ���� �ִ�
		 * 3. �����ҿ� ����� �ּҸ� �������� ���� ���ڿ� "���ѹα�"�� ����� ���� ã�´�
		 * 4. ���� ���ڿ� "���ѹα�"�� ����� ���� ã�´�
		 * 5. �� ��ġ�� println()���� �˷��ش�
		 */
		System.out.println(strNation);
		
		/*
		 * strNation ���ڿ��� ������ ����� ���� �о����
		 * ���⿡ "�츮����"��� ���ڿ��� �߰��Ͽ�
		 * strNation�� �ٽ� ������
		 */
		strNation += "�츮����";
		System.out.println(strNation);
		
		// ���ڿ��� %s�� ����Ͽ� printf()�� ����Ѵ�
		System.out.printf("%s\n", strNation);
		
	}

}
