package com.sist.spring;
import java.io.*; // ���� �б�
import java.util.*;
public class MainClass_StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IO => CheckedException => �ݵ�� ����ó��
		FileReader fr=null;
		try
		{
			long start=System.currentTimeMillis();
			fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0; // �ѱ��ھ� �о�´� (����(X), ���� ��ȣ) 'A'=65...
			String movie="";
			while((i=fr.read())!=-1)
			{
				movie+=String.valueOf((char)i);
			}
			long end=System.currentTimeMillis();
			System.out.println("���� �ð�: "+(end-start)); // �α����� �б�
			// ���� ������ ���
			System.out.println(movie);
		}catch(Exception ex) {}
		finally
		{
			try
			{
				fr.close(); // ���� �ݱ� , ���� �ݱ� , ����Ŭ �ݱ�
			}catch(Exception ex) {}
		}
	}

}
