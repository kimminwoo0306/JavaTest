/*
 *   1. 변수  2. 연산자  3. 제어문  4. 화면 출력
 *   ---------------------------------------재사용 (모아서 저장) => 메소드, 클래스 (해킹 => 데이터 보호(캡슐화)) => 상속, 포함
 *   1. 프로그램 (소스 코딩 반복) => 응용
 *   
 *   데이터 저장  ===>  데이터 조작  ===>  화면출력
 *      (변수)       (연산자, 제어문)
 *      
 *   데이터형 : 메모리 크기 (기본형)
 *   -------------------------
 *   정수
 *     byte   (1byte) : -128 ~ 127
 *     **int    (4byte) : 일반 정수 저장 => -21억 4천 ~ 21억 4천
 *     **long   (8byte) : 접미어(L,l) , 빅데이터, 챗봇
 *   실수
 *     **double (8byte) : 소수점 15자리
 *   문자
 *     char   (2byte) : 0 ~ 65535 => 모든 문자는 번호를 갖고있다. => 'A' =65, 'a' =97, '0' =48
 *                      *** 연산처리시에 정수형으로 변경
 *                      *** 참조변수 => String
 *   논리
 *     **boolean(1byte) : true/false
 *     
 *     데이터형의 크기 => 필요시에는 언제든지 데이터형을 변경할수 있음(형변환)
 *     ----------------------------------------------------------------
 *     byte < short < int < long < float < double
 *            char
 *     -------------------------------------------------------------------       
 *     화면 출력
 *     System.out.println(); ==> 세로 출력 => ln -> newLine
 *     System.out.print();   ==> 가로 출력
 *     System.out.printf();  ==> 서식
 *          => %d, %c, %f, %s
 *             --------------
 *           ***%d = 정수
 *           ***%c = 문자
 *           ***%f = 실수
 *           ***%s = 문자열
 *          ----%o = 8진법 %x = 16진법 %e = 지수 %b = boolean
 *          
 *      특수문자
 *      ------
 *        \t  => tab : 일정 간격 처리
 *        \n  => 다음줄 출력  : newLine
 *        \"  => 경로명
 *    --------------------------------------------------------------
 */
public class 화면출력_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//println()
		//System.out.println("Hello");
		//System.out.println("Java");
		//System.out.print("Hello\t");
		//System.out.println("Java");
		//System.out.printf("%s,%s", "Hello","Java");
		//System.out.printf("평균:%.2f", (85/3.0));
		// %5d    %-5d  ==> 3자리
		System.out.printf("%-5d%-5d%-5d", 90,80,70); // jdk1.5 => c언어의 printf 에서 모방
		System.out.println("90   80   70");
	}

}
