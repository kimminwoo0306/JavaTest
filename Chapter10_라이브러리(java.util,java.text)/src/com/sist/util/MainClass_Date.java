package com.sist.util;
// Date : 시스템의 현재 날짜 / 시간을 읽어온다 => 오라클 데이터형과 연결 (DATE)
// Date클래스의 단점 : 기능 빈약하다 => 보완 (Calendar) -> Date는 날짜 저장용으로 사용이 많다
import java.util.*;
import java.text.*;
public class MainClass_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성하는 과정
	//	Date date=new Date(); //SimpleDateFormat
		/*
		 *  Format => 변환
		 *  ------------
		 *  년도 : yyyy (대소문자 구분)
		 *  월 : MM, M -> MM (1~9) => 01,02... M -> 1,2,3 ...
		 *  일 : dd, d
		 *  ----------------------------------> 실제 날짜를 계산 (dd, MM -> d,M)
		 *      01, 02, 03, 04, 05, ... 08, 09 오류 -> 0(8진법)
		 *                              ------
		 *  시간 : hh
		 *  분 : mm, , --> MI
		 *  초 : ss, s
		 *  
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-d h:m:s");
		while(true)
		{
		Date date=new Date();
		String today=sdf.format(date); // 스케쥴러 -> 경매
		System.out.println(today);
		try
		{
			Thread.sleep(1000);
		}catch(Exception ex) {}
		}
	}

}
