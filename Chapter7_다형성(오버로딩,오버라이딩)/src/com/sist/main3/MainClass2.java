package com.sist.main3;
/*
 *   super: ���� Ŭ������ ��ü, this : �ڽ��� ��ü
 *    => ������, �ν��Ͻ� �޼ҵ忡�� ����� ���� (static �޼ҵ忡���� ����� �� ����)
 *   super(): ���� Ŭ������ ������, this(): �ڽ��� �����ڸ� ȣ��ÿ� ���
 *   ---------------------------------
 *      �����ڿ����� ����� ����
 *      => ù�ٿ� ����Ѵ�
 *      
 *      class A
 *      {
 *      	int a,b,c; ==> super
 *      	public A() {}
 *      	public A(int a, int b){this.a=a; this.b=b;}
 *      	public A(int a, int b, int c){}
 *      }
 *      class B
 *      {
 *      	int a,b,c; ==> this
 *      	public B(){}
 			{
 				super(); ==> public A(){}
 				super(10,20); ==> public A(int a, int b){}
 				super(10,20,30); ==> public A(int a, int b, int c){}
 				super�� ������� �ʴ� ��쿡�� �ڵ����� super()
 			}
 			public B(int a)
 			{
 				this();                                         -|
 				super(100,200);  // A=> a=100, b=200, c=0;      -| ���̾��� ����, �Ѱ��� ���
 			}
 			�ڽ� �ܿ� ���� Ŭ������ ����, �޼ҵ� ��� �����ϴ�
 			--     ---------
           this      super
           => super�� ����
           => this �� ���� ���´�
 *      }
 *   
 */
class A
{
	int a,b,c;
	public A()
	{
		this.a=10; // �������� => �������
		// �浹�� ���� ���¸� this. ������ ���� => ���������� �Ű������� �켱������
		b=20;
		c=30;
	}
	public A(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public A(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
class B extends A
{
	int a,b,c;
	public B()
	{
		a=100;
		b=200;
		c=300;
	}
	public B(int a, int b, int c)
	{
		// super(a,b,c); ==> super() �ڵ� ȣ�� this()
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void print()
	{
		System.out.println("this.a="+this.a); // B class�� ������ �ִ� a,b,c
		System.out.println("this.b="+this.b);
		System.out.println("this.c="+this.c);
		
		System.out.println("super.a="+super.a); // A class�� ������ �ִ� a,b,c
		System.out.println("super.b="+super.b);
		System.out.println("super.c="+super.c);
	}
}
public class MainClass2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b=new B(1000, 2000, 3000); // A a=new A();
//		b.print();
		// A, B, Object
		Object obj=new Object();
		A a=new A();  // A, Object
		B b=new B();  // B, Object
		
		if(a instanceof Object)
			System.out.println(true);
		if(b instanceof Object)
			System.out.println(true);
		if(b instanceof A)
			System.out.println(true);
		if(b instanceof B)
			System.out.println(true);
		if(a instanceof B)
			System.out.println(false); // �̼���
		
		//String s="";
		//if(s instanceof StringBuffer)
		
		// A�� Object��
		// B�� Object��
		// B�� A��
		// A�� B�� -> ���, ����
		/*
		 *   ����(Object)
		 *        |
		 *      �ΰ� (A)
		 *    |        |
		 *   ���� (B)   ����
		 *   
		 */
	}

	
}
