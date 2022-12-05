package com.sist.spring;

import java.util.StringJoiner;

/*
 *   471page
 *   ------- 11�� , 12��
 *   
 *   String
 *   ------
 *   StringBuffer : append() : ���ڿ� ����
 *                  toString() : ���� ��ȯ
 *   Math : random() / ceil() (�ø�) / round() (�ݿø�)
 *   Wrapper : Integer, Double, Boolean => ���ڿ��� �ش� ������������ ����
 *             parseInt() parseDouble(), parseBoolean()
 *             => �ڽ� / ��ڽ�
 *             => List<int> (X) List<Integer> (O)
 *   StringTokenizer : nextToken(), counterToken(), hasMoreTokents
 *   Pattern / Matcher
 *   -------   ------- find(), group(), compile()
 *   -------------------------------------------------- 1��
 */

public class MainClass_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red,green,blue,black,white,yellow,magenta";
		// ���� �и�
		String[] colors=color.split(",");
		for(String c:colors)
		{
			System.out.println(c);
		}
		System.out.println("====��� ���� (join)====");
		String ss=String.join("-", colors);
		System.out.println(ss);
		System.out.println("====��� ���� ====");
		ss=color.replace(",", "-");
		System.out.println(ss);
		// �̹��� (�������� ���ÿ� ��� ����) => ������ ����ؼ� ���� => �����͸� ������ ���
		// ����Ŭ => ^
		StringJoiner sj=new StringJoiner(",", "{", "}");
		for(String s:colors)
		{
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}
