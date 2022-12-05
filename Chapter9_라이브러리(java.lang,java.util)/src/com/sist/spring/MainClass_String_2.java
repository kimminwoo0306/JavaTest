package com.sist.spring;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
 * https://www.google.co.kr/search?q=%EC%9E%90%EB%B0%94&source=hp&ei=x8Z6Y8HQGtK2oATc35TwCw&iflsig=AJiK0e8AAAAAY3rU15HwF_0A2S0du-PFBsYW-IrPks7u&ved=0ahUKEwiB0ILdgr77AhVSG4gKHdwvBb4Q4dUDCAo&uact=5&oq=%EC%9E%90%EB%B0%94&gs_lcp=Cgdnd3Mtd2l6EAMyEQguEIAEELEDEIMBEMcBENEDMg4ILhCABBCxAxDHARDRAzILCC4QgAQQsQMQgwEyCwgAEIAEELEDEIMBMhEILhCABBCxAxCDARDHARDRAzILCC4QgAQQsQMQ1AIyBAguEAMyBAguEAMyCAguEIAEENQCMgQILhADUABYhQJg3wJoAXAAeAGAAYYBiAGIA5IBAzAuM5gBAKABAQ&sclient=gws-wiz
 */
public class MainClass_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//%EC%9E%90%EB%B0%94&
			//EC9E90EBB094 => 인코딩 (byte[])
			String name="자바";
			System.out.println("==== 인코딩 ====");
			byte[] b=name.getBytes("UTF-8");
			for(byte bb:b)
			{
				System.out.print(String.format("%02X", bb));
			}
		//	System.out.println(Arrays.toString(b));
			System.out.println("\n==== 디코딩 ====");
			byte[] b2=name.getBytes("CP949");
			for(byte bb:b2)
			{
				System.out.print(String.format("%02X", bb));
			}
		} catch (Exception ex) {}
	}

}
