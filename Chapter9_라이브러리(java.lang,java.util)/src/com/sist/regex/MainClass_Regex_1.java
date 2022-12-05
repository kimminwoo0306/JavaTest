package com.sist.regex;
// 패턴 => 형태를 만들어서 찾기
// 예) IP 전체를 가지고 온다 => [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
//                        숫자(1개~3개)
//						  127.0.0.1
/*
 *    패턴 사용 기호
 *    ---------
 *    한글 : [가-힇] (자바, 자바스크립트, 파이썬, 오라클) 동일
 *    영문 : [A-Za-z]
 *     -대문자 : [A-Z]
 *     -소문자 : [a-z]
 *    숫자 : [0-9]
 *    ---------------------------
 *    [abc] => a|b|c => [a-c]
 *    
 *    [] => 범위
 *    {} => 갯수
 *    --------------> [A-Z]{3} ==> 대문자 알파벳 3개
 *                    [가-힇]{3,5} => 한글 3~5글자
 *    ^ : 시작, 제외
 *    ------- startsWith  예) ^[가-힇]{3} => 한글로 시작하는 3글자  ----> [^가-힇] 한글을 제외
 *    $ : 끝 [A-Z]$  ==> 대문자 알파벳으로 끝난 문자열
 *    ------- endsWith
 *    . : 임의의 한글자
 *    .* : 모든문자
 *    + : 한글자 이상
 *    * : 0글자 이상
 *    --------------------------------------------------------------
 *    [0-9] ==> \\d  ==> 제외 \\D [^0-9]
 *    \\s 공백문자 \\S 공백문자 제거
 * // \\w 알파벳,숫자 => \\W
 *       [A-Za-z0-9]  [^A-Za-z0-9]
 */
import java.util.regex.*;
public class MainClass_Regex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"bat","baby","bonus","c","cA"
				,"ca","co","c.","c0","c#",
				"car","combat","count","date","disc"
				,"홍길동","맛있다OK","시작1234"
		};
		// c[a-z]* ==> c, ca, co, c., car, combat, count
		// c[a-z]  ==> ca co
		// c[a-zA-Z0-9] => cA,ca,co,c0
		// c\\w
		// .* => 전체읽기 (한글자 포함)
		// .+ => 두개
		//[bc].*
	    //
		for(String s:data)
		{
			Matcher m=p.matcher(s);
			if(m.matches())
			{
				System.out.println(m.group());
			}
		}
	}

}
