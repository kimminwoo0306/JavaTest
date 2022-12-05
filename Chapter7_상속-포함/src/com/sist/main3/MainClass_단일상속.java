package com.sist.main3;
class A
{
	int a;
}
class B extends A
{
	// a
	int b;
}
class C extends B
{
	// a, b
	int c;
}

class D extends A
{
	// a
}
class E extends A
{
	// a
}
/*
 *   ��� ���� ���� : static(����), ������, �ʱ�ȭ���
 *   ��� ��������� : ����� ���� ��� ������ �Ұ��� (private)
 *                => protected(X)
 *                => default(X)
 *                => private => setXxx(), getXxx()
 *   ��� ����
 *      class ����Ŭ���� extends ����Ŭ����
 *      => ��� => �ʿ�ø��� �����ؼ� ����� ����
 *               ---------------------- �������̵�
 *               �������̵� => ����� (��� ������ ����)
 *               => �޼ҵ�
 *                  ������ �޼ҵ�� �Ű�����
 *                  ----------------
 *                  ���� ������� ����� �� ���� / Ȯ��� �����ϴ�
 *                  private < default < protected < public
 */
public class MainClass_���ϻ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
