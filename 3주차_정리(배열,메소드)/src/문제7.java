/*
 * 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
 */

public class 문제7 {
	static int max(int a, int b)
	{
		int max=0;
		if(a<b)
			max=b;
		else
			max=a;
		return max;
		// return Math.max(a,b);
		// return a<b?b:a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(max(50,60));
		int m=max(590,60);
		System.out.println(m);
	}

}
