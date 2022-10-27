/*
 *     변수 : 한개의 데이터를 저장하는 메모리 공간
 *           ----------
 *           변경해서 사용할 수 있는 값
 *           => 변수는 반드시 초기화를 해줘야 함.
 *     1) 메모리의 크기 결정(데이터형, 기본형, 자료형) ==> 자바에서 지원하는 메모리 크기 (사용자 정의 : 배열, 클래스(참조변수))
 *        기본형
 *          *** 데이터는 필요시에는 변경이 가능하다   ex. (int => long)
 *        	정수
 *            byte (1byte = 8bit) => -128 ~ 127 (네트워크 전송, 파일 업/다운로드)
 *            int  (4byte = 32bit) => -21억 4천 ~ 21억 4천  (일반적으로 사용하는 숫자) => default
 *            long (8byte = 64bit) => 접미어 (L,l) 100L
 *          실수
 *            double (8byte = 64bit) => 소수점이 15자리수
 *          문자
 *            char (2byte = 16bit) => 0~65535 ==> 연산처리시 정수로 변경
 *          논리
 *            boolean (1byte = 8bit) => true/false
 *     2) 각 데이터형의 초기화
 *        byte b = 10; ==>0
 *        int i=100;   ==>0
 *        long k=100l; ==>0L
 *        double d=10.5; ==>0.0
 *        char c='A';  ==> '\0'
 *        boolean bb=true; ==>false
 *     3) 다른 변수의 값을 교환
 *        int a=10;
 *        int b=20;  ==> a=20, b=10
 *        => 임시변수 설정 ==> 임시변수
 *        int tmp=a;
 *        a=b;
 *        b=tmp;
 *      4) 상수, 리터럴, type, 변수
 *         상수 = 변하지 않는 값 (변경이 불가능, 반드시 선언과 동시에 값을 설정)
 *               final 데이터형 상수명=값;
 *               -----
 *         리터럴 = 실제 저장된 값
 *                int a=100;   ===> 100
 *         type = 데이터 형
 *                int a=100;   ===> int
 *         변수 = 한개의 데이터를 저장하는 메모리 공간
 *                int a=100;   ===> a
 *      *** 변수는 범위를 벗어나는 경우 오버플로우가 발생함.
 *      5) 문자열 결합 (+)
 *         "나이:"+30 ==> "나이:30"
 *         "" => 문자열
 *         문자열 + any type(모든 타입) ==> 문자열
 *         any type + 문자열 ==> 문자열
 *         
 *         7+""+7 =>
 *         "7" + 7 ==> "77"
 *         
 *         7+""+7+7 ==> "777"
 *         7+""+(7+7) ==> "714"
 *         
 *         7+7+""+7 ==> "147"
 *         모든 프로그램 => 컴퓨터에 명령을 내린다 ==> 수행
 *                       -----------순서 => 알고리즘
 *                       
 *         "true"+true  ==> "truetrue"  ==> +
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
