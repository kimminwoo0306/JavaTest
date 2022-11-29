/*
 * 입력 받은 값이 짝수인지 홀수인지 판별하는 메소드를 구현하시오
 */
public class 문제8 {
	static String isTrue(int a)
	{
		if(a%2==0)
			return "짝수입니다";
		return "홀수입니다";
		// return a%2==0?"짝수입니다":"홀수입니다"
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=isTrue(11);
		System.out.println(s);
	}

}
