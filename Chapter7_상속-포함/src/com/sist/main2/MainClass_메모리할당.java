package com.sist.main2;


/*
 *    ���
 *      => �޸� �Ҵ�
 *         �ڽ� ��ü = �ڽ��� ������
 *         ------------------
 *         A a=new A()  ==> A�� ������ �ִ� ������ ����Ѵ�
 *        --       ----     ����/�޼ҵ�
 *        
 *        �ڽ��� ��ü = ���� Ŭ���� ������
 *        A�� B�κ��� ����� �޴´�
 *        class A extends B
 *        
 *        B b=new A(); // ������ B, �޼ҵ�� A
 *        -       ---
 *        A a=new B(); // ������ A, �޼ҵ�� B
 *        -       ---
 */
class A
{
	int a=10;
	public void display()
	{
		System.out.println("A:display Call....");
	}
}
class B extends A
{
	int a=100;
	public void display()
	{
		System.out.println("B:display Call....");
	}
}
public class MainClass_�޸��Ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		//b.a=100, �޼ҵ� B:display Call....
		System.out.println(b.a);
		b.display();
		
		A c=new B(); // �߻�, �������̽�
		System.out.println(c.a); //10
		c.display(); // B:display Call....
		
		B d=(B)c; // ����ȯ B
		System.out.println(d.a);
		d.display();
		
		// ����ȯ => ��ӳ����� Ŭ���� > ��ӹ޴� Ŭ����
		// �ڹٿ��� �����ϴ� ���̺귯�� ==> return Object
	}

}
