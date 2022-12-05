package com.sist.util;
// 자주 사용되는 클래스
/*
 *     =================> 예약일, 예약시간 (Admin, user)
 *                                    ------- 회원관리, 예약관리, 결제관리, 공지사항 올리기, 게시물 관리
 *     1. Random (500page) => java.util (import사용필수) : 임의의 수를 추출
 *        => nextInt() => 정수 난수 (범위 => int)
 *        => nextInt(int i) => 지정
 *           nextInt(100) => 0~99
 *           nextInt(1000) => 0~999
 *           
 *             => nextBoolean
 *             => nextDouble
 *     2. Scanner : 입력값 받는 경우
 *                  nextInt(), next()
 *     3. StringTokenizer : 문자열을 자른다 (웹, 서버) => 빅데이터
 *     --------------------------------
 *     4. Date
 *     5. Calendar
 *     ------------------------
 *     6. List => ArrayList, Vector, LinkedList, Queue, Stack
 *                ---------                      -----  -----
 *     7. Set => HashSet / TreeSet
 *               -------
 *     8. Map => Hashtable / HashMap
 *                           -------
 *                           
 *     java.io / java.net / java.sql / java.text (SimpleDateFormat, MessageFormat,ChoiceFormat)
 *     -----------------------------------------
 *     File관련 URL          Connection, Statement, ResultSet
 *     Buffered~ URLEncoder
 *     
 *     기타 : 열거형 (Enum), 어노테이션 (@~), 제네릭스(<ClassName>) , 람다식(함수 포인트)
 *     =====================================================================
 *     java.lang.regex.*
 *     ---------------- Pattern / Matcher
 *     
 *     2차 자바 + 웹관련 자바
 *     -----------------
 *     3차 자바 => 1차, 2차, 스프링(라이브러리)
 */
import java.util.*;
public class MainClass_Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Random 클래스 생성
		Random r=new Random();
//		int i=r.nextInt(31)+1;
//		System.out.println(i);
		int[] reserve=new int[r.nextInt(10)+11]; // 11~20
		for(int i=0; i<reserve.length;i++)
		{
			reserve[i]=r.nextInt(31)+1;
			// Set 클래스를 이용해서 중복을 제거
		}
		Arrays.sort(reserve);
		System.out.println("===예약이 가능한 날짜===");
		for(int i:reserve)
		{
			if(i>=21)
			{
				System.out.println(i+" ");
			}
		}
	}

}










