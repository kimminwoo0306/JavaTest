package com.sist.connect1;
// 다른 클래스에서 접근시에는 ==> import
// import
/*
 *    다른 패키지에서 존재하는 클래스를 사용할 때 import
 *    => 라이브러리 / 사용자 정의 클래스
 *    
 *    import 패키지명.클래스명 => 클래스 한개만 가지고 올때
 *    import 패키지명.* => 패키지에 있는 모든 클래스를 불러올 때
 *    import static 패키지명.클래스명.메소드명 => 메소드 1개
 *    import static 패키지명. 클래스명.* => 메소드 전체 사용시
 */
// Math, String, StringBuffer, Integer, Object => 자동으로 import 처리
/*
 *   생략 => 자동 컴파일러가 처리
 *   1) 메소드
 *      void display()
 *      {
 *          return; ==> 생략을 하면 자동 추가
 *      }
 *   2) 생성자
 *      class A
 *      {
 *      	A()  ==> 생략시에는 자동 추가
 *      	{
 *      	}
 *      }
 *   3) import문
 *   	import java.lang.* ==> 자동으로 추가
 */
//import java.util.Scanner; // 권장
//import java.util.*;
import static java.lang.Math.random;
import static java.lang.System.out;
import static java.lang.String.valueOf;
// Math.random()
//static일때만 가능
/*
 *    패키지 선언
 *    package 패키지명; => 분류(폴더)
 *    --------------
 *    import
 *    = 패키지명.클래스명
 *    = 패키지명.*
 *    
 *    java코딩
 *    package  ==> 한 번만 사용
 *    import   ==> 여러개 사용이 가능
 *    class 선언
 *    
 *      ** static
 *      import static 패키지명.클래스명.메소드명
 *      import static 패키지명.클래스명.*;
 *      
 *      static
 *      클래스명.메소드명
 *      ------ 생략
 *      
 *      import는 라이브러리만 사용하는 것이 아니라 사용자 정의 클래스도 사용한다
 *      --------------------------------------------------------
 *      주의점)
 *           import 사용이 필요없는 경우
 *           ----------------------
 *           같은 패키지에 있는 클래스를 사용할 때는 import 사용 x
 *           --------
 *           다른 패키지에 있는 클래스를 사용할 때는 반드시 import를 사용한다
 *           
 *           패키지명 설정
 *           com.회사명.분류명
 *           -------------- 폴더명 (키워드를 사용하면 안된다)
 *           알파벳, 한글도 가능, 숫자 가능, 키워드는 불가능, 특수문자 가능
 *           ----- 권장사항(소문자) 3~7자리
 */
public class 접근지정어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*10)+1;
		out.println(valueOf(a));
	}

}
