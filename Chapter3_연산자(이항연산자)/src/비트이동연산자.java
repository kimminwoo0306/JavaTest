/*
 *       비트이동 연산자 ( <<, >>)
 *       
 *       10<<3 ==> 1010(000) => 1010000 => 64+16 = 80
 *       ----- 10*2^3 = 80
 *       
 *       10>>3 ==> 1010
 *                  --- 제거 => 1 => 1
 *       ----- 10/2^3 = 1
 */
public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10<<3);
		System.out.println(10>>3);
	}

}
