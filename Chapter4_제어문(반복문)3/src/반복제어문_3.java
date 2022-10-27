import java.util.Scanner;

/*
 *    1. 컴퓨터 가위바위보
 *       ------------- 계속 진행 ===> y/Y 누르면 종료
 */

public class 반복제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0, lose=0, same=0;
		int count=0; // 게임 횟수
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			//난수 발생 ==> 게임 시점 -> 가위(0),바위(1),보(2)
			int com=(int)(Math.random()*3);
			System.out.println("가위(0) 바위(1) 보(2)!!: ");
			int user=scan.nextInt();
			if(user<0 || user>2)
			{
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			count++;
			//결과
			if(com==0)
				System.out.println("컴퓨터:가위");
			else if(com==1)
				System.out.println("컴퓨터:바위");
			else
				System.out.println("컴퓨터:보");
			
			if(user==0)
				System.out.println("사용자:가위");
			else if(com==1)
				System.out.println("사용자:바위");
			else
				System.out.println("사용자:보");
			
			//확인           com-user
			/*
			 *       com         user
			 *        0            0 ==0          draw
			 *                     1 ==-1         user win
			 *                     2 == -2        com win
			 *        1            0 == 1         com win
			 *                     1 == 0         draw
			 *                     2 == -1        user win
			 *        2            0 == 2         user win
			 *                     1 == 1         com win
			 *                     2 == 0         draw
			 */
			
			switch(com-user)
			{
			case -1: case 2:
				System.out.println("User Win");
				win++;
				break;
			case -2: case 1:
				System.out.println("Computer Win");
				lose++;
				break;
			case 0:
				System.out.println("Draw");
				same++;
			}
			//종료 확인
			System.out.print("게임을 종료할까요?(y/n):");
			char c=scan.next().charAt(0); // Scanner로 문자 한개 받기
			if(c=='y' || c=='Y')
			{
				System.out.println("게임 종료!");
				break; //while문 종료
			}		
		}
		System.out.println(count+"전"+win+"승"+same+"무"+lose+"패");	
		
	}
}