package com.sist.spring;
// format() ==> printf()
// join/format => byte[] => ���ڵ�
public class MainClass_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ð� ó�� ==> ���ϴ� �������� ���� (�� => System.out.printf(""); => ������)
		int a=10;
		int b=20;
		String temp=String.format("%d + %d = %d", a,b,a+b);
		System.out.println(temp);
		
		// 12�������� => 12 => String.format("%d������", 12)
	}

}
