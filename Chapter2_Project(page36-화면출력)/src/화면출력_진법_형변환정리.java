/*
 * 화면 출력 / 키보드 입력값 / 형 변환
 * -------
 * System.out.println();  => 가장 많이 사용되는 화면 출력 기능
 * System.out.print();
 * System.out.printf();
 *         => 데이터형 출력 종류 (%d => 정수, %f => 실수, %c => 문자, %s => 문자열)
 * 화면 입력 
 *      Scanner => 사용 방법
 *       1) 클래스 ==> 메모리 저장
 *          Scanner scan=new Scanner(System.in); => System.in (키보드 입력값)
 *                      ----- 클래스를 메모리에 저장할 때 반드시 사용(동적 메모리 할당)
 *       2) 클래스가 가지고 있는 기능을 활용
 *          Scanner가 가지고 있는 기능
 *          정수값 받을 경우 = nextInt()  (메소드: 한가지 기능을 가지고 있다)
 *          문자열 받는 경우 = next()
 *          논리형 받기 = nextBoolean()
 *          실수형 받기 = nextDouble()
 *       -------------------------------------------------java.io(BufferedReader) ==> 예외처리를 반드시 해야함
 *       진법
 *         표현법 : 8진법(0~), 16진법(0x~)
 *         => 2진법 : 0,1
 *            8진법 : 0~7
 *            16진법 : 0~15  (0~9, A~F)
 *            
 *         => 음수표현 (2의 보수)  ==> 양수보다는 1이 크다
 *                                   70 ==> -71 (~ : 반전연산자)
 *       ***** 형 변환 (UpCasting, DownCasting)
 *       
 *                  1) UpCasting (자동 형변환)
 *                     변수 초기값
 *                     double d=10;
 *                     --------------------> 변수의 데이터 형 >= 값
 *                     연산자
 *       = 자동 형변환
 *       = 강제 형변환 
 */
public class 화면출력_진법_형변환정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=65;
		System.out.println(c);
		byte b= (byte)300;
		System.out.println(b);
	}

}
