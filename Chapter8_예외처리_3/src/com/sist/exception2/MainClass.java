package com.sist.exception2;
import java.util.Scanner;
public class MainClass {
	public static int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("====== Menu ======");
		System.out.println("1. Top 200 ");
		System.out.println("2. 가요");
		System.out.println("3. POP");
		System.out.println("4. OST");
		System.out.println("5. 트로트");
		System.out.println("6. 재즈");
		System.out.println("7. 클래식");
		System.out.println("8. Exit");
		System.out.println("==================");
		System.out.print("메뉴 선택: ");
		return scan.nextInt();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MusicSystem ms=new MusicSystem();
		while(true)
		{
			int m=menu();
			if(m==8)
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else
			{
//				try
//				{
					MusicVO[] music=ms.musicData(m);
					for(int i=0;i<music.length;i++)
					{
						System.out.println((i+1)+". "+music[i].getTitle());
					}
//				}catch(Exception ex) {}
//				finally
//				{
//					System.out.println("======= 출력 완료 =======");
//				}
			}
		}
	}

}
