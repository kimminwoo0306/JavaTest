package com.sist.main4;
/*
 *   A a=new B();
 *   A a=new C();
 *   
 *   B b=new D();
 *   B b=new E();
 *   B b=new B();
 *   -------------
 *   
 *   C c=new F();
 */
class A
{
	public void display()
	{
		System.out.println("A:display() Call....");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("B:display() Call...."); // �������̵�
	}
}
class C extends A
{
	
}
class D extends B
{
	public void display()
	{
		System.out.println("D:display() Call...."); // �������̵�
	}
	// �޼ҵ� �߰�
	public void ddd()
	{
		System.out.println("D:ddd() Call....");
	}
}
class E extends B
{
	public void display()
	{
		System.out.println("E:display() Call...."); // �������̵�
	}
}
class F extends C
{
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	B b=new D();
	//	B b1=new E();
	//	B b2=new B();
	//	B b3=(B)new A();
	//	A a=new B();
	//	B b3=(B)a;
		B b1=new D(); // �������̵� �� �޼ҵ常 ������ ����
		//display();
		b1.display(); // D�� ������ �ִ� �޼ҵ� ȣ��
		// b1 ���� �Ұ���
		//b1.ddd(); �Ұ�
		D d=new D();
		d.display();
		// d ���ٰ���
		d.ddd();
		D d1=(D)b1;
		// ddd().display();
		d1.display();
		// d1 ���� ����
		d1.ddd();
		new D().display(); // ��ü�� �ʿ���� ���
		// ���� ����
		new D().ddd();
		
	}

}
