package com.sist.has_a;
class Board
{
	public void insert()
	{
		System.out.println("Board:insert Call....: �Խù� ÷��");
	}
	public void list()
	{
		System.out.println("Board:list Call....: �Խù� ��� ���");
	}
	public void update()
	{
		System.out.println("Board:update Call....: �Խù� ����");
	}
}
class ReplyBoard
{
/*	public void insert()
	{
		System.out.println("ReplyBoard:insert Call....: �Խù� ÷��");
	}
	public void list()
	{
		System.out.println("ReplyBoard:list Call....: �Խù� ��� ���");
	}
	public void update()
	{
		System.out.println("ReplyBoard:update Call....: �Խù� ����");
	}*/
	Board board=new Board()
	{
		public void update()
		{
			System.out.println("ReplyBoard:update Call....: �Խù� ����");
		}
	}; // extends ���� �������̵� => �͸��� Ŭ����
	public void reply()
	{
		System.out.println("ReplayBoard:replay Call....: ��� �ø���");
	}
	// ����
	// �����ؼ� ��� , �ִ� �״�� ���
}
public class MainClass_����_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplyBoard rb=new ReplyBoard();
		rb.board.list();
		rb.board.insert();
		rb.board.update();
		rb.reply();
	}

}
