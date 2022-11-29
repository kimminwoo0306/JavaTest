/*
 * 3의 배수를 판별하는 메소드를 구현하시오
 */
public class 문제9 {
	static boolean bl(int a)
	{
		if(a%3==0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hi=bl(250);
		if(hi==true)
			System.out.println("3의배수");
		else
			System.out.println("3의배수아님");
	}

}
