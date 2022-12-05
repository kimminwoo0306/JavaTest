package com.sist.util;

import java.util.*;
// �ܾ ���� => split, StringTokenizer, Regex
public class MainClass_StringTokenizer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = { "100|hong|����|����", "200|�ڹٹ�|5|����", "210|�ڹٹ�|hong", "300|hong|shim|Hi~", "400|hong" };
		for (String msg : data) {
			StringTokenizer st = new StringTokenizer(msg, "|");
			int protocol = Integer.parseInt(st.nextToken());
			switch (protocol)
			{
				case 100:
				{
					System.out.println("���ڿ�: "+st.countTokens());
					String id=st.nextToken();
					String sex=st.nextToken();
					String loc=st.nextToken();
					System.out.println(id+"���� "+loc+"�� �����ϼ̽��ϴ�!");
				}
				break;
				case 200:
				{
					System.out.println("���ڿ�: "+st.countTokens());
					String rName=st.nextToken();
					String rInwon=st.nextToken();
					String rState=st.nextToken();
					System.out.println("���̸�:"+rName+", �ο�:"+rInwon+", "+rState+"�Դϴ�");
				}
				break;
				case 300:
				{
					System.out.println("���ڿ�: "+st.countTokens());
					String myId=st.nextToken();
					String youId=st.nextToken();
					String m=st.nextToken();
					System.out.println(myId+"���� "+youId+"�Բ� "+m+" ������ �����ϼ̽��ϴ�!"+m);
				}
				break;
				case 400:
				{
					System.out.println("���ڿ�: "+st.countTokens());
					String id=st.nextToken();
					System.out.println(id+"���� �����Ͽ����ϴ�!");
				}
				break;
			}
		}

	}

}
