package com.sist.main3;
// Object => super
/*
 *      Object
 *         |
 *       Super
 *         |
 *        Sub
 */
class Super
{
	int a, b;
	public Super(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void print()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
class Sub extends Super // Super �޸� �Ҵ�(������ ȣ�� => �⺻ ������) => Sub �޸� �Ҵ�
{
	int c;
	int a, b;
	public Sub(int a, int b, int c)
	{
		// ���� Ŭ������ �����ڸ� ���� ȣ��
		super(a,b); // ��� ���� Ŭ������ ������ ȣ��
		this.a=100;
		this.b=200;
		this.c=c;
	}
	public void print()
	{
		System.out.println("super.a="+super.a); // ��� ���� Ŭ������ ��ü = super
		System.out.println("super.b="+super.b);
		System.out.println("this.a="+a); // ���� Ŭ������ ��ü = this (this�� �����浹�� ���� ��쿡 ������ ����)
		System.out.println("this.b="+b);
		System.out.println("this.c="+c);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub(10, 20, 30);
		sub.print();
	}

}
