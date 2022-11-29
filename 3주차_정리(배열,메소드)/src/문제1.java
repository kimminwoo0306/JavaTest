/*
 * 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
 */
import java.util.Scanner;
public class 문제1 {
	//static double div(int a, int b) => 반드시 실수변경 => a/(double)b
	static String div(int a, int b)
	{	
		String result="";   //예외처리
		if(b==0)
			result="0으로 나눌수 없다";    // 오류처리 (기본)
		else
			result=String.valueOf(a/(double)b); // 결과값을 (문자열로)String으로
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력: ");
		int a=scan.nextInt();
		System.out.println("두번째 정수 입력: ");
		int b=scan.nextInt();
		
		String result=div(a, b);
		System.out.println(result);
	}

}
