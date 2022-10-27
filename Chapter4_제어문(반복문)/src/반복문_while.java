/*
 *  while문
 *  -----  무한루프 (데이터베이스에서 많이 등장)
 *  1) 순차적으로 실행
 *  	초기값1
 *      while(조건식)2 -- 조건이 true일때 반복{}, false 종료
 *      {
 *      	반복수행문장3
 *      	증가식4
 *      }
 *                   1    2     4
 *      =====> for(초기값;조건식;증감식)
 *                        |3
 *      			반복 수행 문장
 *      
 *      주의점)
 *            for(;;)  ==> while(true)
 *            while() ==> 반드시 조건문을 제시
 *                ---- 조건(비교,논리,부정연산자), true/false
 */
public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A-Z, Z-A
		char c='A';
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}
		//'Z'+1 == [
		System.out.println();
		c='Z'; //초기화
		while(c>='A')
		{
			//  대문자, 소문자의 차이 == 32    'A'=65, 'a'=97
			System.out.print((char)(c+32)+" ");
			c--;
		}
		System.out.println();
		int i=1;
		while(i<=100)
		{
			i++;
		}
		System.out.println("i="+i);
	}

}
