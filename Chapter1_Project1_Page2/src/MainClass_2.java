/*
 * 	1. 자바 설치
 * 		jdk.java.net/archive/
 * 		14~18
 * 	2. path 환경변수 : C:\jdk-17.02/bin ==> 실행파일
 * 	3. classpath : 자바에서 지원하는 라이브러리 사용
 * 					.;C:\jdk-17.02/lib
 * ------------------------------------------
 * 	4. 편집기 (이클립스) eclipse.org ==> 가장 최신버전(Java, Jave EE)
 * 		Java SE (일반 자바 ==> 자바 실행 도구, 라이브러리)
 * 		Java EE (기업용 환경 | 웹)
 * 		Java ME (모바일) ==> X (Kotlin)
 * 	5. STS(Spring, Spring-Boot), Oracle
 * ============================================
 * 	1) 자바 표현법
 * 		숫자 관련
 * 			정수
 * 			 = 10진법 10,20...
 * 			 = 8진법 011, 012 ...
 * 			 = 16진법 0xFF , 0xXX (사용 빈도가 거의 없음)
 * 			실수 : 10.5(8byte), 10.5F (4byte)
 * 				    double		float
 * 		문자 관련
 * 			= ' ' => 한 글자만 저장이 가능   'AB' (x) => 'A', '홍' (o)
 * 		문자열 관련 : 한 글자 이상 == "ABC", "A" ...
 * 		논리 관련 : True / False
 *		============================> 대소문자 구분, 문장 종료시 세미콜론(;)
 *		============================> 컴퓨터에 명령을 내리는 것
 *									  순차적으로 내린다 (알고리즘)
 *									  int a=10; 4바이트 메모리를 만들고 10을 저장해라
 * 	2) 주석 : 컴파일시 번역에서 제외가 되는 부분 = 분석하기 편함 =>8page
 * 	3) 문법 에러사항
 * 		1. 세미콜론
 * 		2. main을 못찾는 경우
 * 		3. 대소문자 구분
 * --------------------------------클래스명(대문자 시작), 변수(소문자), 메소드(소문자)
 * 		4. {} ==> 들여쓰기
 * 		저장명==> 10page, 저장명 class 는 public을 따라감 
 * 	4) 특징
 * 		1. 운영체제의 독립적이다.
 * 		2. 객체지향 프로그램 (6장,7장)
 * 			= 재사용(상속, 포함) => 새롭게 추가, 기존의 기능 변경
 * 								오버로딩      오버라이딩
 * 			= 데이터 보호 : 캡슐화
 * 			= 유지 보수 목적
 * 		3. 배우기가 쉽다 (C언어 보다)
 * 		4. 자동 메모리 관리
 * 		5. 동적 로딩
 * 			프로젝트 : 클래스가 여러개가 있다. = 필요시만 다 로딩
 * 
 * 		jdk ==> 실행 종류, 가상머신(JVM) : 자바를 실행하기 위한 기계 장치
 */
// 주석 : Ctrl+Shift+/     , Ctrl+Shift+\ (주석풀기)
public class MainClass_2 {

	
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * System.out.println("1"); System.out.println("2"); System.out.println("3");
	 * System.out.println("4"); System.out.println("5"); }
	 */
	  
	 
	public static void main(String[] args) {
for(int i=1; i<=5; i++) {
	for(int j=1; j<=6-i; j++) {
		System.out.print("*");
	}
	System.out.println();
}
	}
}