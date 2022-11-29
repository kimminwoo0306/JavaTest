/*
 * 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
 */
import java.util.Scanner;
public class 문제2 {
	static String change(String alpha)
	{
		/*
		 * String s="";
		 * for(int i=0;i<alpha.length();i++)
		 * {
		 * 		char a=alpha.charAt(i);
		 * 		a=(char)(a-32)
		 * 		s+=a;
		 * }
		 */
		return alpha.toUpperCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String alpha=scan.next();
		String s=change(alpha);
		System.out.println(s);
		
	}

}
