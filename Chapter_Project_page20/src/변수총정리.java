/*
 *     1. 실행과정
 *        .java (원시소스 : 프로그래머만 아는 코드)
 *        .class (컴파일된 파일 : 0,1 만들어진 바이너리 파일 => 컴퓨터만 알 수 있는 언어)
 *        
 *        Hello.java ===> Hello.class ====> JVM(main을 번역) ==> 화면에 출력
 *                   javac             java
 *        --------------------------------------------------------------
 *        
 *     2. 변수 : 데이터관리 프로그램 (메모리에 한개의 데이터를 저장하는 공간)
 *     3. 변수명 설정 방법
 *         1) 알파벳, 한글로 시작 (알파벳은 대소문자 구분한다)
 *         2) 숫자 사용 가능 (앞에서 사용 금지)
 *         3) 특수문자 사용 가능( _ , $)
 *              _앞에, 뒤에 ==> 임시 파일, 임시 변수
 *         4) 키워드는 사용 금지 ( int, class, public, double ...)
 *         5) 문법사항(X)
 *             변수 : 소문자시작
 *             상수 : 모든 문자 대문자
 *        데이터형 (기본형 : 자바에서 지원하는 메모리 크기)
 *        정수
 *           byte = 1byte, int = 4byte, long = 8byte
 *        실수
 *           double = 8byte
 *        문자
 *           char = 2byte
 *                'A'(65)    'a'(97)    '0' (48) ==> 아스키 코드값
 *        논리
 *           boolean = 1byte
 *        초기값 설정
 *          byte _byte=1;
 *          short _short=2;       ===> _byte
 *          int _int=3;           ===> _byte, _short, _char
 *          long _long=4L;        ===> _byte, _short, _char, _int
 *          char _char='A';       ===> _byte
 *          float _float=10.1f;   ===> _byte, _short, _char, _int, _long
 *          double _double=10.2;  ===> _byte, _short, _char, _int, _long, _float
 *        
 *           크기
 *           byte < short < int < long < float < double
 *                  char
 *                  
 *           -------------------------------------------------------------------
 *           문자열 "" ==> 여러개의 문자열 사용가능, 공백도 가능 ==> 문자열 저장(String)
 *           결합 : +
 *           "a=" + 7 => "a=7"
 *           7+"a"  => "7a"
 */
public class 변수총정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=10.5;
		System.out.println("d="+d);
		d='A';  // char을 double로 자동변환
		System.out.println("d="+d);
		d=10;  // int를 double로 자동변환
		System.out.println("d="+d);
		d=10L;
		System.out.println("d="+d);
		d=10.7F;
		System.out.println("d="+d);
	}

}
