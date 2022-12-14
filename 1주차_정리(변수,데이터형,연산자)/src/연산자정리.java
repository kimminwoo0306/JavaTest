/*/
 *    연산자
 *    ----
 *      단항연산자
 *         증감연산자 (++, --)
 *         부정연산자 (!)
 *         형변환연산자 (type)
 *      이항연산자
 *         산술연산자 (+, -, *, /, %) => 가장 많이 사용되는 연산자
 *         비교연산자 (==, !=, <, >, <=, >=)
 *         논리연산자 (&&, ||)
 *         대입연산자 (=, +=, -=)
 *      삼항연산자
 *         (조건)?값1:값2
 *         
 *      *** 제어문 관련 ==> 부정, 비교, 논리 (조건, 반복) ==> 조건(true/false) => boolean
 *          연산 + 제어
 *          
 *      page 91 (연산자 우선순위) => 비트연산자 / 쉬프트연산자(제외)
 *         단항연산자 -> 산술연산자 -> 비교연산자 -> 논리연산자 -> 대입연산자
 *      page 91-92
 *         산술변환
 *          => 연산은 항상 같은 타입끼리 연산
 *            ========================= 같은 데이터형으로 변경후 연산
 *              int + double
 *              ---
 *              double
 *              -----------------------double (자동)
 *              사용자(프로그래머)가 변경 => 강제 형변환
 *              int + (int)double = int
 *      page 92 : int 이하 데이터형 (byte, char)
 *                byte+byte=int
 *                char+char=int
 *                byte+char=int
 *               *** int/int=int ==> int/double == 소수점 인식
 *      page 93
 *           단항 연산자
 *           ++, --
 *           한개 증가, 한개 감소 ==> 
 *           a++, a=a+1, ++a, a+=1 => 1 증가
 *           a--, a=a-1, --a, a-=1
 *           ** 전치 (++a)
 *              결과값을 대입 ==> 증가된 값 대입
 *           ** 후치 (a++)
 *              결과값을 대입 ==> 대입하고 나중에 증가
 *           int a=10;
 *           System.out.println(a);   =10
 *           System.out.println(a++); =10
 *           
 *           int a=10;
 *           int b=++a
 *           
 *       page 96 (음수/양수)
 *           int a=10;
 *           a=-a; =====> a=-10
 *      =====================================================
 *       page 97 (산술연산자)
 *       ==> 산술변환이 있다 ( 데이터형이 같은 것만 연산 => 큰데이터형으로 변경)
 *           int + double ==>
 *           ---
 *           double
 *           
 *           ex) 10+10.5
 *               --
 *               10.0
 *               --------> 20.5
 *               
 *               10+(int)10.5
 *               -------------->20
 *               
 *               10/3 => 3
 *               10/(double)3 ==> 3.333.....
 *               -------------------------------------------
 *               / (0으로 나눌수 없다) ==> 조건 (오류처리), 정수/정수 = 정수 => 필요하면 정수를 실수로 변환
 *               % 부호가 왼쪽 부호를 따라 간다
 *               *** +,-보다 *,/,%가 우선순위다.
 *               예) 5+6*10
 *                  -->
 *                   5+6*10
 *                     ----
 *                   --- === 65
 *                   (5+6)*10 ==> ()최우선순위 연산자 ==110
 *                   
 *               *** 작은 데이터형으로 연산 결과를 받는 경우의 문제점 ==> 오버플로우를 발생할 수 있다.(저장 범위를 벗어난다.)
 *                     byte b=(byte)300; ==> 127 ==> 44
 *                     -----------------
 *                     256+44
 *              -----------------------------------------------------------------
 *              +,-,* ==> 누적 (장바구니 ==> 물품의 가격계산, 수량)
 *              /, %  ==> 통계
 *               산술연산자 ==> 결과값
 *         page 109 비교 연산자 (결과값은 무조건 boolean)
 *              ==, !=, <, >, <=, >=  ----> 숫자외 관련(정수, 실수, 문자)
 *              ------ (정수,실수,문자,논리)
 *               <= ( < || == )
 *               >= ( > || == )
 *         page 114 논리연산자 (결과값 무조건 boolean)
 *              && : 범위가 포함
 *                   (조건) && (조건)  ==>  조건 2개 동시 true일때 true
 *              || : 범위가 미포함
 *                   (조건) || (조건)  ==>  조건 1개 이상이면 true
 *              *** 118page 효율적인 연산
 *              
 *              &&
 *              (조건) && (조건)
 *              -----
 *              false   =======> 다음 조건은 확인없이 출력 - False
 *              ||
 *              (조건) || (조건)
 *              -----
 *              true    =======> 다음 조건은 확인없이 출력 - True
 *         page 130 삼항연산자 (단점은 결과값을 알 수 없다.)
 *              (조건)?값1:값2
 *              -----true일때 값1
 *              -----false일때 값2  
 *         page 132 대입연산자
 *          = , (+=, -=, /= : 복합대입연산자)
 *           int a=10;  10을 a에 대입
 *           a+=1;      a에 1을 더한값을 저장
 *           --------------a=a+1;
 *           a-=1;      a에 1을 뺀값을 저장
 *           --------------a=a-1;
 *           a/=2;      a에 2를 나눈값을 저장
 *           --------------a=a/2;
 *           
 *           ===============================> a++, a-- : 여러개 감소, 증가
 */
import java.util.Scanner;
public class 연산자정리 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int number;
	String str;
	
	System.out.println("정수를 입력하세요:");
	number=scan.nextInt();
	str=(number/2==0)?"짝수다":"홀수다";
	System.out.println(str);
	
	}

}
