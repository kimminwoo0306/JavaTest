package com.sist.wrapper;
/*
 *    Wrapper : �⺻�� => ������ (����� ���ϰ� ����� �� Ŭ������ ����)
 *    �⺻�� 
 * ***   int      ==> Integer
 * ***   byte     ==> Byte
 *    short    ==> Short
 * ***   long     ==> Long => ������, AI
 *    char     ==> Character
 * ***  boolean  ==> Boolean
 *    float    ==> Float
 * ***   double   ==> Double
 *    
 *    *** WrapperŬ������ �������
 *    1) �⺻�� �����͸� Object������ ���� (Ŭ���� ��üó��) ==> java.util
 *    2) ***Collection : �����͸� ��Ƽ� ���� : �迭�� ��ü (������)
 *    *** �ڹ��� : String, Integer, List
 *    3) �⺻������ �ʿ��� �޼ҵ带 ���� => ���ڿ��� ����, ����
 *    
 *    *** �ڽ� / ��ڽ�
 *    Integer i=10; // Ŭ�������� ���� �����Ͱ��� ���� (�ڽ�)
 *    int k=i; // Ŭ���� �����͸� �⺻���� ���� (��ڽ�)
 *    ========> �⺻���� Ŭ�������� ���о��� ��� ����
 *    ========> ���׸��� <>
 *    List<int> => ����
 *    List<Integer> => ����
 */
public class MainClass_Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ii=10;  // �ڽ�
		int i=ii;   // ��ڽ�
		System.out.println("ii="+ii+",i="+i);
		System.out.println(ii.toString());  // ���ڿ� ��ȯ
		System.out.println(ii.MAX_VALUE);
		System.out.println(ii.MIN_VALUE);
		System.out.println(Integer.toBinaryString(ii)); // ������ ��ȯ
		System.out.println(Integer.toOctalString(ii)); // 8����
		System.out.println(Integer.toHexString(ii)); // 16����
		// �⺻�� + ��� ÷��
		String s="100";
		// ���ڿ��� ������ ���� parseInt() => ������ �ʼ� (���� => ����) ��ȭ��ȣ, �Խù� ��ȣ, ������ȣ...
		int k=Integer.parseInt(s);
		System.out.println(k);
		/*
		 *  ��
		 *     ����� ������ �� => �ڹ� ũ����Ʈ ���� HTML/CSS
		 *     -------------------------------------Front
		 *     ���� => �ڹ� ����
		 *     ���� => ����Ŭ
		 *     ---------------------------------------Back
		 */
	}

}
