/*
 *   2진법 : 0,1 로만 이루어져 있다.
 *   8진법 : 출력할때 맨앞에 0 ex) 011, 012 ...
 *   16진법 : 앞에 0x붙어잇음
 *   ---- 프로그램 (10진법) 쓰는것이 기본
 *   
 *   음수 표현 ==> 1~~
 *   10
 *    2진법으로 => 00001010(8bit)
 *       1의보수 :11110101 
 *      2의보수 :+       1
 *             ----------
 *              11110110
 *      2의보수 ==> 00001010 (첫번째 1까지만 냅두고 나머지 뒤집음)
 *                ------
 *       byte + char = int         
 *       byte + byte = int
 *       int이하 데이터형이 연산 ==> int
 */
public class 진법출력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println(Integer.toBinaryString(165));
		System.out.println(Integer.toOctalString(165));
		System.out.println(Integer.toHexString(165));
		System.out.println(~165);*/
		byte b1 = 127;
		byte b2 = 127;
		int b3 = (b1+b2);
		System.out.println(b3);
	}

}
