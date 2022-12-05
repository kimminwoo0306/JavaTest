package com.sist.spring;
import java.io.*;
/*
 * StringBuffer sb=new StringBuffer(); // ���ڿ��� �����ϴ� �޸� �ӽð��� (Buffer)
 * -----------------------------------
 * sb.append("Hello);
 * ----sb----     -----------
 *   0x100            Hello
 * ----------     -----------
 * 
 * String s="Hello " + "Java" ==> s.concat("Java")
 *           0x100 ===> GC���
 *  
 *  --s--  --------
 *  0x200     Hello
 *  -----  --------
 *  
 */
public class MainClass_StringBuffer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\news2.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			System.out.println(sb.toString());
			// ���ڿ� ���� => append(), String ���� => toString()
			// public StringBuffer Append(String s)
			// �����ε� ==> append(boolean b) append(char[] c) append(int i)... ���ڿ��� ������ ��
			// public String toString()
			// ==> ������ �бⰡ ������ => String���� ��ȯ (String���� ����)
		} catch (Exception ex){}
		finally
		{
			try
			{
				fr.close();
			} catch (Exception ex) {}
		}
	}

}
