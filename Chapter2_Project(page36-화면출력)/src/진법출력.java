// 42page ~ 74page (형변환)
/*
 *   진법 , 지수 ==> SQL => 임베디드 AWS 기반 FullStack
 *   
 *   1. 변수설정
 *   2. 연산자 => 3장
 *   3. 제어문 => 4장
 *   4. 메소드
 *   5. 클래스 (객체지향) =>6,7장
 *   6. 예외처리 => 8장
 *   7. 라이브러리 (컬렉션, 제네릭스) =>12,13장
 *   8. IO =>15장
 *   
 *   --------------------------------------------------
 *   자바에서 정수 표현
 *   1) 10진법 : 10,20,30...
 *   2) 2진법 : 0,1
 *   3) 8진법 : 0~7
 *   4) 16진법: 0~9+A~F
 */
public class 진법출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(27));
		System.out.println("0"+Integer.toOctalString(27));
		System.out.println("0x"+Integer.toHexString(27));
	}

}
