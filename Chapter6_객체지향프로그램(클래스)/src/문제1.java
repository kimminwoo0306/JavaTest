//class
/*
 *  1. 데이터형 클래스 (관련된 데이터를 모아서 관리) => 사용자 정의 데이터 타입 => ~VO (읽기 / 쓰기)
 *  	                                                       Spring
 *                                                           ~DTO, ~Bean
 *                                                         Mybatis,   JSP
 *  2. 액션 클래스 (관련된 기능을 모아서 관리) => 메소드의 집합 => ~DAO, ~Manager, ~Service
 *     예)
 *         게시판
 *         관련된 데이터
 *         ------------no, name, subject, content, pwd, regdate, hit
 *         관련된 기능
 *         ------------ 목록 출력하는 기능, 상세보기 기능, 글쓰기 기능, 수정하기 기능, 삭제 기능, 검색 기능
 *         ------------------------------객체 지향 프로그램
 *         ------------ name, pwd ==> 은닉화 (캡슐화)
 *         ------------ 댓글 : 재사용 (상속)
 *         ------------ 자료실 : 글쓰기 기능(업로드), 상세보기 기능(다운로드) => 수정(오버라이딩)
 *  3. 클래스의 종류 ( 추상클래스, 인터페이스, 내부클래스) ==> 6장/7장
 *  
 *  객체 지향을 사용하는 이유
 *  ------------------
 *  1. 어렵다 => 사용이 편리하다
 *  예
 *  	물을 마신다
 *      ---------
 *      1. 삽을 든다
 *      2. 땅을 판다
 *      3. 물이 나오면
 *      4. 바가지를 이용해 물을 마신다.
 *      ------------------------물을 다마시면 (절차적 언어)
 *      삽을 들고 다시 땅을 판다.
 *      
 *      정수기 : 만들기는 어렵다 >> 만들고 나면 사용하기 쉽다(재사용) => 유지보수
 *  2. 재사용성이 높다 (기존에 있는 코드를 그대로 사용 => 작성하기 쉽다)
 *  3. 코드 관리가 편하다
 *  4. 신뢰성이 높다 (이미 상용화된 데이터를 사용) => 오류가 없는 코드 (오작동을 방지하는 프로그램)
 *      예 ) 사용자 정의 스프링
 *           스프링 라이브러리(O) : 4(XML), 5(자바) = Spring-Boot
 *     객체지향 프로그램 구현 (권장)
 *     ---------------------
 *     1. 데이터를 보호 (보안) : 캡슐화
 *     2. 재사용을 높인다 : 상속 / 포함
 *     3. 수정, 추가가 용이하게 만든다 : 다형성 ( 오버라이딩, 오버로딩 )
 *     ============================================================> 객체지향의 3대특성
 *     
 *     객체지향 프로그램
 *     1. 클래스
 *         = 데이터만 모아서 관리
 *           ----
 *             모든 사용자가 공유하는 변수 (공유변수, 공통변수) => 변수앞에 static
 *             객체마다 따로 사용하는 변수 (인스턴스 변수) => 객체마다 변수를 따라 가지고 있다
 *         = 메소드만 모아서 관리
 *         = 데이터+메소드 모아서 관리(혼합형)
 *     2. 객체  : 클래스에 설계 데이터+메소드를 동시에 저장된 메모리 공간 이름
 *     
 *                객체 -> 현실세계를 특성화시킨 것이다
 *                              ---- 추상화, 공통적으로 가지고 있는 속성 단순화
 *                객체 -> 여러개의 데이터를 저장할 수 있는 메모리 공간의 이름
 *                
 *     3. 클래스의 구성요소
 *        = 변수  ==> 데이터타입이 달라도 된다
 *        = 메소드 
 *        = 생성자
 *     4. 객체 선언 / 생성
 *        
 *        선언
 *        클래스명 객체명;
 *        생성
 *        객체명=new 생성자();
 *            ----- 클래스에 맞는 크기의 메모리를 만든 다음에 해당 메모리 주소를 객체에 넘겨준다 (리턴형 int)
 *             new -> 메소드 int malloc(sizeof(클래스명)) : 사용빈도가 많다 => 연산자로 승격
 *             class A
 *             {
 *                 int a;               //4
 *                 String name;         //4
 *                 String sex;          //4
 *                 double score;        //8
 *             }
 *             
 *             ==> 20byte
 *             
 *             new를 이용하면 새로운 메모리 공간을 만든다.
 *             ---------------------------------
 *             클래스는 한개만 설계 ==> 객체는 여러개 저장이 가능하다
 */

// -Movie
class Movie {
	String title;
	String open;
	String genre;
	String nation;
	String grade;
	int runTime;
	double avg;
	int audience;
	int boxOffice;
	String poster;
	String story;

}

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
		movie.title = "동감";
		movie.open = "2022.11.16";
		movie.genre = "로맨스/멜로";
		movie.nation = "한국";
		movie.grade = "12세관람가";
		movie.runTime = 114;
		movie.avg = 8.7;
		movie.audience = 247;
		movie.boxOffice = 2;
		movie.story = "1999년, '용'은 첫눈에 반하게 된 '한솔'을 사로잡기 위해\n친구에게 HAM 무전기를 빌린다.";

		System.out.println(movie.title);
		System.out.println();
		System.out.println("개봉 " + movie.open + "       평점       ★" + movie.avg);
		System.out.println("장르 " + movie.genre + "         누적관객     " + movie.audience + "명");
		System.out.println("국가 " + movie.nation + "              박스오피스    " + movie.boxOffice + "위");
		System.out.println("등급 " + movie.grade);
		System.out.println("러닝타임 " + movie.runTime + "분");
		System.out.println(movie.story);
	}

}
