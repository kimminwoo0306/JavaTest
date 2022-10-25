/*
 *   중첩조건문 (이중 if)
 *   // if (조건문 && 조건문) ↙
 *   if(조건문)
 *   {
 *   	if(조건문)
 *   	{
 *   	}
 *   }
 *   
 *   
 *   컴퓨터 => 가위바위보
 *   
 *   컴퓨터              사용자
 *    가위               가위
 *                      바위
 *                      보
 *    바위               가위
 *                      바위
 *                      보
 *     보               가위
 *                      바위
 *                      보                                     
 */
// => 가정 가위(0), 바위(1), 보(2)
import java.util.Scanner;

public class 제어문_중첩조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보!!(0,1,2) : ");
		int player = scan.nextInt();
		// 컴퓨터
		int com = (int) (Math.random() * 3);
		// 확인
		if (com == 0)
			System.out.println("컴퓨터 : 가위");
		else if (com == 1)
			System.out.println("컴퓨터 : 바위");
		else if (com == 2)
			System.out.println("컴퓨터 : 보");

		if (player == 0)
			System.out.println("사용자 : 가위");
		else if (player == 1)
			System.out.println("사용자 : 바위");
		else if (player == 2)
			System.out.println("사용자 : 보");
		// 결과값
	/*	if (com == 0) {
			if (player == 0)
				System.out.println("비겼습니다.");
			else if (player == 1)
				System.out.println("사용자 이겼습니다.");
			else if (player == 2)
				System.out.println("컴퓨터가 이겼습니다.");
		}

		else if (com == 1) {
			if (player == 0)
				System.out.println("컴퓨터가 이겼습니다.");
			else if (player == 1)
				System.out.println("비겼습니다.");
			else if (player == 2)
				System.out.println("사용자가 이겼습니다.");
		}

		else if (com == 2) {
			if (player == 0)
				System.out.println("사용자가 이겼습니다.");
			else if (player == 1)
				System.out.println("컴퓨터가 이겼습니다.");
			else if (player == 2)
				System.out.println("비겼습니다.");
		}*/
		
		//결과값
		/*
		 * 컴퓨터     사용자  => com-user
		 * 가위(0)    가위(0) - 0
		 *          바위(1)  - -1  ==p
		 *          보(2)   - -2  ==c
		 *-----------------
		 * 바위(1)    가위(0) - 1   ==c
		 *          바위(1)  - 0 
		 *          보(2)   - -1  ==p
		 *-----------------
		 * 보(2)    가위(0)  - 2   ==p
		 *          바위(1) - 1   ==c
		 *          보(2)   - 0
		 *          
		 *          com==> -2,1
		 *          player => -1,2
		 *          
		 */
		int res=com-player;
		if(res==-1 || res==2)
			System.out.println("You Win!");
		else if(res==-2 || res==1)
			System.out.println("You Lose :(");
		else
			System.out.println("Draw");
	}
}
