import java.util.*;
public class 정리_12 {
/*
 * 8.  arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20} 배열에 중복된 데이터를 제거하고
 * 아래의 그림과 같이 출력하는 프로그램을 작성하시오.
 * (데이터출력시 순서는 상관없음)

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10, 20, 30, 40, 50, 60, 70, 40, 30, 20} ;
		Set<Integer> set=new HashSet<Integer>();
		for(int a:arr)
		{
			set.add(a);
		}
		
		System.out.println(set);
		List<Integer> list=new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

	
}
