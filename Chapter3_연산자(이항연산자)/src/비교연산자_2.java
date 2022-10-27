import java.util.Scanner;

/*
 *   char 비교 : char 는 정수형으로 변경후 비교
 *   ---------------------------------------
 *      'A' < 'B'
 *      --     --
 *      65     66
 *      
 *      
 *      1 > '0'  => false
 *      -   ---
 *           48    => 1 > 48
 */
public class 비교연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='A';
		char b='a';
		
		System.out.printf("%c == %c : %b\n", a,b,a==b);
		System.out.printf("%c == %c : %b\n", a,b,(a+32)==b);
		//대소문자의 차이 = 32
		System.out.printf("%c != %c : %b\n", a,b,a!=b);
		// %b = boolean 출력
		/*
		 *   %d ==> 대입하는 데이터는 정수
		 *   %c ==> 문자
		 *   %f ==> 실수
		 *   %s ==> 문자열  ( 문자는 '', 문자열은 "")
		 */
		int c=98;
		System.out.printf("%d == %c : %b\n",c,b,c==b); //char는 모든 연산이 있을 경우 정수로 변경이 된다.
		// ==, !=, <, >, <=, >= 비교가 가능
		// == , != (boolean) true, false
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.printf("%b == %b : %b\n",b1,b2,b1==b2);
		System.out.printf("%b != %b : %b\n",b1,b2,b1!=b2);
		/* 
		 * system.out.printf("%b < %b : %b\n", b1,b2,b1<b2);
		 */
		// 소스 코딩시마다 컴파일한다
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int k=scan.nextInt();
		System.out.println((k%2==0)?"짝수":"홀수");// 삼항연산자 => 성별 => 주민번호 확인
	}

}
