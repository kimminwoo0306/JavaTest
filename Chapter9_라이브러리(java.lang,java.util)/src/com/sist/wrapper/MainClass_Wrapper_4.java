package com.sist.wrapper;
/*
 * StringBuffer => append / toString
 * Math => random / ceil / round
 * Wrapper
 *    Integer => parseInt() / toString() => String.valueOf()
 *    Double  => parseDouble() / toString() => String.valueOf()
 *    Boolean => parseBoolean() / toString() => String.valueOf()
 *    
 *    String / Object
 *    ---------------------------java.lang
 *    java.util
 */
public class MainClass_Wrapper_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d=10.5; // �ڽ� (Ŭ������ �⺻�� �����Ͱ� ����) => Ŭ�������� �޸� �ּҰ��� ����
		double d1=d; // ��ڽ� // �⺻������ Ŭ������ ���� �Ұ���
		// Double double�� ȥ���ؼ� ��� ����
		System.out.println("d="+d);
		System.out.println("d1="+d1);
		String s="100.67";
		double d2=Double.parseDouble(s); // ���ڿ��� double������ ����
		System.out.println(d2);
		String s1="true";
		boolean b=Boolean.parseBoolean(s1);
		// true�� ���� ��ȯ
		System.out.println("b="+b);
		// �����ʹ� ����Ŭ(��������) -> ������ ����
		// Number(4)=int, Number(7,2)=double, boolean
		// Integer.parseInt(), Double.parseDouble, Boolean.parseBoolean
	}

}
