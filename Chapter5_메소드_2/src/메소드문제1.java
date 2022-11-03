/*
 *  정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
	정수 입력 
	이진법 처리
	출력 

 */
import java.util.Scanner;

public class 메소드문제1 {
	static void binary1(int num)
	{
		int[] arr=new int[16];
		int index=15;
		while(true)
		{
			arr[index]=num%2;
			num=num/2;
			if(num==0)
				break;
			index--;
		}
			for(int i=0; i<arr.length;i++)
			{
				if(i%4==0 && i!=0)
					System.out.print(" ");				
				System.out.print(arr[i]);
			}
	}

	static int[] binary2(int num)
	{
		int[] arr=new int[16];
		int index=15;
		while(true)
		{
			arr[index]=num%2;
			num=num/2;
			if(num==0)
				break;
			index--;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=scan.nextInt();
		int[] b=binary2(num);
		for(int i=0; i<b.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");				
			System.out.print(b[i]);
		}
		System.out.println();
		binary1(num);
	}

}
