package com.sist.time;
/*
 *  Period / Duration  -- 시간차이
 *  ------ 날짜차이
 *  
 *   LocalDate d1
 *   LocalDate d2
 *   
 *   Period p=d1-d2;
 *   
 *   LocalTime t1;
 *   LocalTime t2;
 *   
 *   Duration d=t1-t2;
 */
import java.time.*;
public class MainClass_Time_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2022, 11, 25);
		
		Period p=Period.between(date1, date2);
		System.out.println(p.getDays());
		// 음수 / 양수
	}

}
