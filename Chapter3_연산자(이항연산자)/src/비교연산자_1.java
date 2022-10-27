/*
 *   비교연산자 : 기본형만 비교
 *             ------- 정수 / 실수 / 문자 / 논리
 *             ------- 문자열 비교(equals) ==> 로그인, 아이디체크
 *             
 *        1) == 같다
 *        2) != 같지않다
 *        3) < 작다
 *        4) > 크다
 *        5) <= 작거나 같다
 *        6) >= 크거나 같다
 *        ------------------------------무조건 결과값 boolean
 *        
 *        예 )  6==6 true
 *             6!=6 false
 *             6<6  false
 *             6>6  false
 *             6<=6 true
 *             6>=6 true
 */
public class 비교연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 비교
		int a=(int)(Math.random()*5)+1;
		           //0.0~0.99 => *5 => 0~4 => 1~5
		int b=(int)(Math.random()*5)+1;
		
		System.out.println("a="+a+", b="+b);
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>=b:"+(a>=b));

	}

}
