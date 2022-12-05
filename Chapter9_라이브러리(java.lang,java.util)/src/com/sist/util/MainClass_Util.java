package com.sist.util;
// ���� ���Ǵ� Ŭ����
/*
 *     =================> ������, ����ð� (Admin, user)
 *                                    ------- ȸ������, �������, ��������, �������� �ø���, �Խù� ����
 *     1. Random (500page) => java.util (import����ʼ�) : ������ ���� ����
 *        => nextInt() => ���� ���� (���� => int)
 *        => nextInt(int i) => ����
 *           nextInt(100) => 0~99
 *           nextInt(1000) => 0~999
 *           
 *             => nextBoolean
 *             => nextDouble
 *     2. Scanner : �Է°� �޴� ���
 *                  nextInt(), next()
 *     3. StringTokenizer : ���ڿ��� �ڸ��� (��, ����) => ������
 *     --------------------------------
 *     4. Date
 *     5. Calendar
 *     ------------------------
 *     6. List => ArrayList, Vector, LinkedList, Queue, Stack
 *                ---------                      -----  -----
 *     7. Set => HashSet / TreeSet
 *               -------
 *     8. Map => Hashtable / HashMap
 *                           -------
 *                           
 *     java.io / java.net / java.sql / java.text (SimpleDateFormat, MessageFormat,ChoiceFormat)
 *     -----------------------------------------
 *     File���� URL          Connection, Statement, ResultSet
 *     Buffered~ URLEncoder
 *     
 *     ��Ÿ : ������ (Enum), ������̼� (@~), ���׸���(<ClassName>) , ���ٽ�(�Լ� ����Ʈ)
 *     =====================================================================
 *     java.lang.regex.*
 *     ---------------- Pattern / Matcher
 *     
 *     2�� �ڹ� + ������ �ڹ�
 *     -----------------
 *     3�� �ڹ� => 1��, 2��, ������(���̺귯��)
 */
import java.util.*;
public class MainClass_Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Random Ŭ���� ����
		Random r=new Random();
//		int i=r.nextInt(31)+1;
//		System.out.println(i);
		int[] reserve=new int[r.nextInt(10)+11]; // 11~20
		for(int i=0; i<reserve.length;i++)
		{
			reserve[i]=r.nextInt(31)+1;
			// Set Ŭ������ �̿��ؼ� �ߺ��� ����
		}
		Arrays.sort(reserve);
		System.out.println("===������ ������ ��¥===");
		for(int i:reserve)
		{
			if(i>=21)
			{
				System.out.println(i+" ");
			}
		}
	}

}










