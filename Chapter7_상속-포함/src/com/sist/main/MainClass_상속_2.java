package com.sist.main;
class Super2
{
	int a=10;
	int b=20;
	public void display()
	{
		System.out.println("Super: display() Call....");
	}
	// ������, �ʱ�ȭ���, static�� ����� �ƴ϶� ����
	// private�� ����� �ȴ� (��, ������ �Ұ����ϴ�) ==> getter/setter
}
class Sub2 extends Super2
{
	int c=300;
	public Sub2()
	{
		a=100;
		b=200;
	}
	/*
	 *  ==> �޸� �󿡸� ������ �ȴ� => �޸𸮰� ��ӳ��� Ŭ����, ����� ���� Ŭ���� => ���� ������ �ȴ�
	 *  ==> ���� ��Ӹ� ����ȴ�
	 *  ==> ���� Ŭ������ ���� Ŭ�������� ���������� ũ��
	 *  ==> ���� Ŭ������ ���� Ŭ�������� �޸� ������ ũ��
	 *  ��)
	 *     class A
	 *     {
	 *     		int a, b;
	 *     }
	 *     class B extends A
	 *     {
	 *     	 // int a,b;
	 *     		int c;
	 *     }
	 *     
	 *     A a=new A();   a.a, a.b
	 *     ***B b=new B();   b.a, b.b, b.c
	 *     ***A c=new B();   c.a, c.b, c.c (����)
	 *                              --- ���� Ŭ������ �޸� �Ҵ�ÿ��� ����Ŭ������ ������ �ִ� ������ ������ ����
	 *        => �������̽��� �߻� Ŭ�������� ����
	 *           ----------------- �̿ϼ��� Ŭ���� => �ϼ��ؼ� ���
	 *     ***B d=(B)new A();  ==> ����ȯ�� �����߻� --> ����Ŭ������ ������ �ִ� ������ ������ ����
	 *        => ���̺귯�� Ŭ�������� �ַ� ���ȴ�
	 *     �������� ) A>B  => ���� => ��� Ŭ������ �������� ���� ������ �ִ� ���� ���� ũ�Ⱑ ����
	 *     
	 *     B b=new B();
	 *     int     int
	 *     A c=new B();
	 *     double  int
	 *     B d=new A();  ==> ����
	 *     int     double 
	 *     int a=(int)10.5;
	 *     ------------
	 * 	int a;
		int b;
		public void display()
		{
			System.out.println("Super: display() Call....");
		}
	 */
}
public class MainClass_���_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����Ŭ����
		Sub2 sub=new Sub2(); // Sub2 => a, b, c, �޼ҵ� ==> Sub2
		System.out.println("sub2.a="+sub.a);
		System.out.println("sub2.b="+sub.b);
		System.out.println("sub2.c="+sub.c);
		// ����Ŭ����
		Super2 sup=new Sub2();// Super2 =>a, b,  �޼ҵ� ==> Sub2
		System.out.println("sup.a="+sup.a);
		System.out.println("sup.b="+sup.b);
	//  System.out.println("sup.c="+sup.c);
		
		Super2 sup2=new Sub2();//a,b,c => ClassCastException
		Sub2 sub2=(Sub2)sup2;
		System.out.println("sub2.a="+sub2.a);
		System.out.println("sub2.b="+sub2.b);
		System.out.println("sub2.c="+sub2.c);
		
		// ������ Ŭ������ / �޼ҵ�� ������
	}

}
