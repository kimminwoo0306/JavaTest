package com.sist.exception;

import java.util.Arrays;

public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr=new int[6];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=(int)(Math.random()*45)+1; // 1~45
				for(int j=0;j<i;j++)
				{
					if(arr[j]==arr[i]) // 중복이 있으면
					{
						i--;
						break;
					}
				}
			}
			System.out.println("오늘의 로또 번호: ");
			Arrays.sort(arr); //ASC (올림차순)
		//  for(int i=arr.length; i>=0; i--) -> 내림차순(DESC)
			for(int i=0; i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) // 충돌 방지
		{
			System.out.println(e.getMessage());
		}
	}

}
