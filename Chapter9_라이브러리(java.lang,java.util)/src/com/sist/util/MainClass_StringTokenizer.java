package com.sist.util;
/*
 *  StringTokenizer : �����ں��� ���ڿ��� �����ٶ� ��� (�����ͺ��̽� ����) => ����
 *  => java.util
 *  => ������
 *     new StringTokenizer(���ڿ�, ���й���)
 *  => �ֿ�޼ҵ�
 *     countTokens() : �и��� �ܾ��� ����
 *     hasMoreTokens() : ���� ����
 *     nextToken() : �и��� ���ڿ��� ���� �� ���
 *     
 *     *** ������ ������ ���� / ���ڸ��� ���� �߻�
 *     
 */
import java.util.*;
public class MainClass_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date="2022-11-21";
		StringTokenizer st=new StringTokenizer(date,"-");
		//StringTokenizer(date) ==> " "�� ���й��ڿ��� ������ ����
	//	String year=st.nextToken();
	//	String month=st.nextToken();
	//	String day=st.nextToken();
	//	String temp=st.nextToken();
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
