package com.sist.iterator;
import java.util.*;
/*
 *     Iterator / ListIterator
 *     --------   ------------ 단방향(데이터를 읽을때 처음-끝), 양방향(처음-끝, 끝-처음)
 *     = 컬렉션에 저장되어 있는 데이터에 접근
 *     = 표준화 (ArrayList, Vector, LinkedList, Hashset, Hashmap)
 *     Iterator의 주요 메소드
 *     ------------------ hasNext(), next(), remove()
 *                       ---------- 데이터가 있는 경우 true, false => while루프 사용 시 사용
 *     ListIterator의 주요 메소드
 *     -----------------------hasNext(), next(), remove(), hasPrevious()
 *                         1 2 3 4 5             1 2 3 4 5 
 *                         =>                           <=
 */
public class MainClass_iterator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("수박");
		list.add("바나나");
		list.add("귤");
		System.out.println(" ====== 일반 ====== ");
		for(String f:list)
			System.out.println(f+" ");
		System.out.println(" ====== Iterator ======");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
	//		it.remove(); // 값 삭제
			System.out.print(it.next()+" "); // next() 실제 해당에서 데이터를 읽어온다
		}
		System.out.println("\n ====== Vector ======");
		Vector<String> vec=new Vector<String>();
		vec.add("손흥민");
		vec.add("김민재");
		vec.add("황의조");
		vec.add("황인범");
		vec.add("이강인");
		Iterator<String> it2=vec.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		System.out.println("\n ====== LinkedList ======");
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(7);
		list2.add(3);
		list2.add(9);
		list2.add(10);
		list2.add(20);
		Iterator<Integer> it3=list2.iterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next()+" ");
		}
		System.out.println("===== HashSet =====");
		Set<Integer> set=new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		Iterator<Integer> it4=set.iterator();
		while(it4.hasNext())
		{
			System.out.println(it4.next()+" ");
		}
		// 메소드에서 출력 -> 통합
	}

}
