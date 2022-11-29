package com.sist.main;
/*
 *   ============================> 변수 (데이터형), 연산자, 제어문, 배열 (2~5장)
 *     1) 클래스
 *        = 클래스 정의하는 방법
 *         *** 접근지정어
 *         = 클래스 : public => 메모리 할당용
 *         = 메소드 : 다른클래스와 통신을 담당 (기능) => public
 *         = 변수 : 데이터보호 => private
 *         = 생성자 : 메모리 할당 => public
 *           => 대상 분석 (요구사항 분석) => 변수/메소드
 *        class ClassName
 *        {
 *        	--------------------------------
 *           속성 , 필드 => 멤버변수 (캡슐화) ==> getter / setter (변수 : 읽기/쓰기) = 인스턴스 변수
 *           ** 공유하는 변수 (static)
 *           ** 변수는 기본형만 있는 것이 아니다 (배열, 클래스)
 *          --------------------------------
 *           생성자 : 오버로딩 (여러개 있을 수 있다) => 변수에 대한 초기화
 *                   생성자가 없는 경우 => 자동으로 추가 (디폴트 생성자 => 매개변수 없는 생성자)
 *          --------------------------------
 *           메소드 : 기능 처리 (속성, 필드)를 제어한다
 *           위에 있는 속성, 필드와 관련이 없는 경우 (static)
 *           
 *           String s="Hello Java";
 *           s가 가지고 있는 문자 갯수 => s.length()
 *           String.valueOf(10)
 *          --------------------------------
 *        }
 *        = 객체 생성 방법(new)
 *          클래스 (사용자 데이터형)
 *          기본형 => 메모리 자체에 값을 설정
 *            int a=10;
 *            ---
 *             10 a
 *            ---
 *           참조형 => 메모리에 실제 저장된 데이터의 메모리 주소
 *        **   클래스명 참조변수=new 생성자();
 *                  ------ 객체, 인스턴스
 *        **   클래스명 참조변수=클래스명.newInstance()
 *        **   클래스명 참조변수=Class.forName().getInstance()
 *        = 메소드 정의하는 방법
 *          [접근지정어][제어어] 리턴형 메소드명(매개변수...)  - 선언부
 *          {
 *             - 구현부
 *          }
 *          
 *          public static : 객체마다 공통 사용되는 메소드 (데이터베이스)
 *          public final : 종단메소드 (오버라이딩이 불가능) ==> 사용빈도가 없다
 *          public abstract : 선언만 하는 메소드 => 구현 (프로그램에 맞게 구현해서 사용)
 *        = 생성자 정의하는 방법 (291page)
 *          특징
 *          1) 클래스명과 동일
 *          2) 리턴형이 없다 ( 리턴형이 없는 경우 : 일반 인스턴스 메소드)
 *          3) 변수의 초기화, 메모리 저장시에 호출되는 메소드
 *             ---------- 시작 동시에 수행하는 기능이 있는 경우
 *                        -------------웹, 윈도우 (화면 UI)
 *                        = 자동 로그인, 쿠키, 윈도우 화면디자인, 데이터베이스 연결, 서버연결...
 *                        = 프로그램 구동 => 첫번째로 호출되는 메소드
 *          4) 오버로딩
 *             초기화 => 직접 초기화(매개변수가 없는 경우), 사용자로부터 받아서 초기화 (매개변수)
 *             오버로딩 (생성자)
 *               => 메소드명이 동일
 *               => 매개변수가 다르다 (갯수, 데이터형)
 *               => 리턴형은 관계가 없다
 *               method()      ========================> method()
 *               method(int a) ========================> method(int)
 *               method(int b) ========================> method(int)
 *               method(int a, int b) =================> method(int, int)
 *          ***  같은 메소드명을 이용해서 다른 기능을 추가할 때 사용
 *        = this 키워드 : 객체 자신을 => 키워드 (자신)
 *         ----- this는 모든 클래스에 사용
 *              ------ 생성자, 인스턴스 (static메소드는 this가 없다)
 *               class A
 *               {
 *               	public A(A this){}
 *               	public void display(A this){}
 *               	public static void aaa(){}
 *               }
 *               
 *               this의 특징 => this는 static Object this;
 *               this의 생성 => 객체생성시에 저장 ==> 생성된 객체의 주소값
 *               A a=new A();
 *               => 컴파일러 (this=a)
 *               A b=new A();
 *               => 컴파일러 (this=b)
 *               this는 자신의 객체 전송, 지역변수와 구분
 *               -------------------------------- 윈도우
 *        
 *     2) 상속 ==> 객체지향의 특성 (데이터보호는 방법, 재사용,   수정, 추가,        공통적인 내용을 모아서 모듈화)
 *                             -------------  -----     --------        ----------------------
 *                              캡슐화        상속/포함  오버라이딩/오버로딩(다형성)  추상화
 *                              ** 추상 => 공통적으로 사용하는 ==> 문법이 아니라 권장
 *                              
 *                              class A
 *                              {
 *                            	   글쓰기()
 *                                 상세보기()
 *                                 목록출력()
 *                                 수정()
 *                                 삭제()
 *                                 검색()
 *                              }
 *                              
 *                              class B
 *                              {
 *                                 글쓰기()
 *                                 상세보기()
 *                                 목록출력()
 *                                 수정()
 *                                 삭제()
 *                                 검색()
 *                                 답변()
 *                              }
 *                              
 *                              class C extends A
 *                              {
 *                              	
 *                              	답변()
 *                              }
 *                              
 *                              상속(기능을 변경) / 포함(기능 변경x)
 *                              ------------      -----------
 *                              사용자 정의 클래스    라이브러리
 *        = 자바 상속의 특징 (310page)
 *          - 재사용이 가능
 *          - 반복 코딩을 제거
 *          - 기존의 클래스를 확장해서 새로운 클래스 제작 => 개발자 마음대로 수정해서 사용이 가능
 *          - 유지보수
 *          - 상속 => extends (확장)
 *          - 단일 상속만 가능하다
 *          - 상속 내리는 클래스 > 상속받는 클래스 > 상속이 있는 경우에만 클래스의 크기 비교가 가능하다 (형변환)
 *            class Super
 *            class Sub extends Super
 *            ==> 메모리 할당 (사용 => Sub)
 *                   Super
 *                     int a;
 *                     int b;
 *                     aaa();
 *                     bbb();
 *                     
 *                   Sub extends Super
 *                   ----------
 *                     int a;
 *                     int b;
 *                     aaa();
 *                     bbb();
 *                   ----------
 *                     int c;
 *                     ccc();
 *                     
 *                1) 상위 클래스로 생성 (추상 클래스, 인터페이스 => 자신이 메모리 할당이 안된다)
 *                   Super s=new Sub();
 *                         - 사용이 가능
 *                           s.a, s.b, s.aaa(), s.bbb()
 *                           --------  ----------------
 *                           Super       Sub
 *                2) 하위 클래스로 생성
 *                   Sub s=new Sub();    ******* 기본 코드
 *                      Sub가 가지고 있는 변수/메소드
 *                3) 상위 클래스로 생성 받기는 하위클래스로 받기
 *                   Sub s=(Sub)new Super();
 *                      Sub가 가지고 있는 변수/메소드
 *                   
 *        = super 키워드 : 상위 클래스를 제어 (변수값 변경, 메소드 호출시에 주로 사용)
 *        = 메소드 오버라이딩 => 추상 클래스 / 인터페이스 (선언)
 *          1) 메소드 명 동일 
 *          2) 매개변수 동일
 *          3) 리턴형 동일
 *          4) 접근지정어는 확대가 가능 (public)
 *        = final 키워드
 *            1) 반드시 초기화를 한다
 *            2) 지역변수에서도 사용이 가능
 *            3) 변수는 대문자로 사용한다
 *            final => 상수형 변수
 *            static final : 상수
 *        = Object 클래스 : 모든 클래스의 상위 클래스
 *                         -------- 라이브러리 / 사용자 정의 클래스
 *        
 *     3) 인터페이스 / 추상클래스
 *        = 인터페이스 / 추상클래스의 차이점 => 95%
 *          목적)
 *            추상 클래스는 상속받아서 확장하는 목적
 *            인터페이스는 관련된 여러개의 클래스를 묶어서 관리 (메소드가 동일)
 *            => 공통점
 *               = 자신이 메모리 할당을 할 수 없다 (상속을 통해서 구현후에 사용)
 *                ------------------------- 하위 클래스를 이용해서 처리
 *            ----------------------------------------------------
 *                         추상클래스                  인터페이스
 *            ----------------------------------------------------
 *            상속          단일 상속                   다중 상속
 *            ----------------------------------------------------
 *            메소드         구현된 메소드              구현이 안된 메소드
 *                        구현이 안된 메소드            JDK 1.8이상 => 추가 (구현된 메소드 가능)
 *                                               default
 *            ----------------------------------------------------
 *            변수         인스턴스 변수가 존재         인스턴스 변수가 없다
 *                                                상수형 변수만 설정이 가능
 *            ----------------------------------------------------
 *            생성자        존재                     존재하지 않는다
 *            ----------------------------------------------------
 *          상속시 키워드      extends                implements
 *            ----------------------------------------------------
 *           접근지정어       전체사용                  public
 *            ----------------------------------------------------
 *        = 인터페이스 / 추상클래스 정의
 *          추상 클래스
 *          public abstract class ClassName
 *          {
 *           -----------------------------------------
 *            변수 설정 ( 인스턴스, static )
 *           -----------------------------------------
 *            생성자
 *           -----------------------------------------
 *            구현된 메소드
 *           -----------------------------------------
 *            구현이 안된 메소드 (추상 메소드)
 *           -----------------------------------------
 *            구현이 안된 메소드 (추상 메소드) : 공통으로 사용되는 기능
 *            예) 마우스
 *              => 마우스 클릭
 *              => 마우스 이동
 *              => 마우스 드래그
 *              => 마우스 올리기
 *              => 마우스 내리기
 *              
 *              버튼
 *              => 클릭, 더블 클릭
 *              => 프로그램 마다 사용 방법이 틀리다 (구현이 안된 상태로 선언)
 *                 로그인 / 취소, 계산기 (1,2,3...) =
 *                 public abstract 리턴형 메소드명 (매개변수...);
 *                 ------------------------
 *           
 *          }
 *          
 *          인터페이스 : 추상 클래스의 일종 ==> 추상클래스의 단점 보완 (실제 프로그램에서 인터페이스가 더 많이 사용됨)
 *          public interface interface명
 *          {
 *            ----------------------------------------
 *            	상수
 *                  int a=10;     -> 값 지정 안하면 오류남
 *                  ---------------------> 반드시 값을 지정
 *                  자동 추가되는 부분
 *                  (public static final) int a=10;
 *            ----------------------------------------
 *            	구현이 안된 메소드
 *                  void display();
 *                  자동 추가되는 부분
 *                  (public abstract) void display();
 *            ----------------------------------------
 *            	구현이 된 메소드
 *                  default void aaa(){}
 *                  ------- 반드시 추가
 *                  자동 추가되는 부분
 *                  (public) default void aaa(){}
 *            ----------------------------------------
 *          }
 *        = 인터페이스 / 추상클래스 구현방법
 *          abstract class A
 *              => aaa(), bbb(), abstract ccc()
 *           => class B extends A
 *              {
 *              	// 반드시 구현해야되는 부분
 *                  추상메소드 (구현이 안된 메소드) => 반드시 구현해서 사용
 *                  ccc(){}
 *                  ddd(){} // 추가
 *              }
 *              // 메모리 할당하는 방법
 *              B b=new B(); ==> aaa(), bbb(), ccc(), ddd()
 *              A a=new B(); => aaa(), bbb(), ccc() => ddd()사용 불가능
 *              ------------ 오버라이딩 된 메소드를 호출한다.
 *              abstract class A
 *              {
 *                   aaa(){1}
 *                   bbb(){2}
 *                   abstract ccc();
 *              }
 *              class B extends A
 *              {
 *                   aaa(){10}
 *                   bbb(){20}
 *                   ccc(){30}
 *                   ddd(){40}
 *              }
 *              
 *              B b=new B();
 *              b.aaa() ==> 10
 *              b.bbb() ==> 20
 *              b.ccc() ==> 30
 *              b.ddd() ==> 40
 *              
 *              A a=new B();
 *              -   -----    메소드의 주소를 B로 수행
 *              a.aaa() => b.aaa() => 10
 *              a.bbb() => b.bbb() => 20
 *              a.ccc() => b.ccc() => 30
 *              
 *              A c=new A(); => 오류 (메모리 할당이 불가능) ==> 미완성된 클래스
 *              추상 클래스는 반드시 상속을 받아서 구현후에 사용 -> 오버라이딩 기법
 *         interface A
 *         class B implements A
 *         {
 *         		선언된 메소드 구현해서 사용
 *         }
 *         
 *        => 인터페이스도 상위클래스와 동일하게 취급
 *        A a=new B()
 *        --- 인터페이스로 받아서 처리 => 여러개를 묶어서 관리 목적           
 *              
 *        = 인터페이스 상속
 *          interface ====> interface
 *                   extends
 *          interface ====> class
 *                  implements
 *          
 *          다중 상속
 *          interface A
 *          interface B extends A
 *          interface C extends B
 *         ------------------------------ 
 *          interface A
 *          interface B
 *          interface C extends A,B
 *          
 *          interface A
 *          interface B
 *          class C implements A,B
 *          
 *          interface A
 *          interface B
 *          class C
 *          class D extends C implements A,B
 *          
 *        = 1.8 => 인터페이스 default 메소드 : 구현이 된 메소드
 *                 default 리턴형 메소드명 (매개변수...)
 *                 {
 *                 		구현
 *                 }
 *                 --------------------------------------추상클래스가 사라진다
 *                 라이브러리 아직 사용중인 추상 클래스가 존재
 *                 ----------------------------------여러개 기능
 *                 Connection : Oracle, MySql, MS-SQL, MariaDB....
 *                 
 *                 DocumentBuildFactory => HTML, XML, WML, HDML, VML...
 *        
 *     4)예외처리
 *        = 예외처리 종류 (예외 복구, 예외 회피)
 *        = 자바에서 제공하는 예외 처리 클래스 (계층구조)
 *        = 실행 순서
 *        = 사용자정의 예외처리 ==> 호출 방법
 *    ------------------------------------------------ 자바 문법 사항
 *      라이브러리
 *      -------
 *        Object, String,m StringBuffer, Math, Wrapper ==> java.lang
 *        StringTokenizer, Date, Calendar, SimpleDateFormat
 *        List, Set, Map ===> Java.util
 *        IO
 *        ---------------------------------------------------------- 웹
 *        SQL => java.sql
 *        ---------------------------------------------------------- 웹 관련 라이브러리 별도 다운로드
 *        
 */
public class MainClass_클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
