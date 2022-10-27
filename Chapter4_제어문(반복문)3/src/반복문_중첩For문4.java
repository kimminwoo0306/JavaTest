import java.util.Scanner;

/*
 *     ★
 *     ★★
 *     ★★★
 *     ★★★★
 *     
 *     ★★★★
 *     ★★★
 *     ★★
 *     ★
 *     
 *     A
 *     BC
 *     DEF
 *     GHIJ
 *     
 *     A
 *     AB
 *     ABC
 *     ABCD
 *     
 */
public class 반복문_중첩For문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}*/
/*		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}*/
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int n=scan.nextInt();
		
		// 1. 변수의 위치 중요
/*		char c='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}*/
		for(int i=1;i<=4;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
	}

	}
}
