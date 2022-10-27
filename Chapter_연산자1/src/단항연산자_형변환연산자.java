/*
 *   형변환 연산자 : (type)
 *               ------- 데이터형
 *                (int) , (double) , (char)...
 *               ------ 2byte
 *               
 *               크기
 *               byte < char <int < long < float < double
 *               ---------------------------------------- boolean은 형변환 할 수 없다 => 사용자 정의 데이터형(Class)
 *               1) 실수 ==> 정수로 변환
 *                  (int)10.5 ==> 10
 *               2) 정수 ==> 문자로 변환
 *                  (char)65 ==> 'A'
 *               3) 10 ==> 10.0 ======================>자동 형변환이 가능
 *                 (double)10
 *               
 *               4) 10.5+10.5 ==21.0
 *               	int(10.5) + (int)10.5 ==> 20
 *               ----------------------------------
 *                       10   +     10    
 *                  (int) (10.5+10.5) ==> 21
 *                  
 *                      ==> 최우선순위연산자 이용 ==> ()
 *                      
 *                      String addr="서울시 강남구 역삼동" ==> char[]
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int a;
		// 난수
		a=(int)(Math.random()*100)+1;
		//     ---------------------1 ==> Math.random() ==> 0.0 ~ 0.99 *100 = 0.0~99.0
		//-----2   ==> 0~99
		//                        --3 ==> 1~100사이 숫자
		System.out.println(a);
		
		char c;
		c=(char)((Math.random()*25)+65);
		//      ------------------ 0~24 + 65 ==> 65~89
		System.out.println(c);
		
		char d='a';
		char d1=(char)(d-32);
		System.out.println(d1);
		
		// 자동 형변환
		// 다른 데이터형에 값을 대입
		int i='A'; //'A' = 65
		long l=100; // long <= int  (int 는 long 변경) => 100L
		int i2=(int)10.5;
		System.out.println(i);
		System.out.println(l);
		System.out.println(i2);
		
		int m=10;
		int n=3;
		System.out.println(m/(double)n);
		//System.out.printf("%.2f", m/(double)n);
		
		//음수/양수
		int k =10;
		System.out.println(-k);  //  .(주소 접근지정 연산자)  , [] (배열)
	}

}
