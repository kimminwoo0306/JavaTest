package com.sist.generics;
class Box<T> // T -> 임시저장 클래스형 데이터 -> T는 지정된 데이터형으로 변경 (사용하지 않는 경우에는 Object)
{
	T item;
	// Box<String> ---> T -> String
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
public class MainClass_제네릭스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box(); // T => Object
		box.setItem("aaa");
		String s=(String)box.getItem();
		Box<String> box1=new Box<String>();
		box1.setItem("bbb");
		s=box1.getItem(); // 형변환이 필요없다
		Box<Integer> box2=new Box<Integer>();
		box2.setItem(123);
		int i=box2.getItem(); // 언박싱
		// Integer i=100; 박싱, int ii=i; 언박싱
		/*
		 *   Wrapper
		 *   클래스형 = 기본형데이터 : 박싱
		 *   기본형 = 클래스형 : 언박싱
		 *   ------------------------ 호환
		 *   Integer
		 *   int  = Integer
		 *   Integer = int
		 */
	}

}
