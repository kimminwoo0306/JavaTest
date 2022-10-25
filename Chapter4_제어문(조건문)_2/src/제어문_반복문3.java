// updown게임
import java.util.Scanner;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//System.out.print("제가 생각한 숫자를 맞춰보세요! : ");
		//int num=scan.nextInt();
		int com=(int)(Math.random()*100)+1;
		
		for(;;) //무한루프
		{
			System.out.print("숫자를 맞춰보세요 : ");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다.");
				// 처음부터 다시 실행한다
				continue; //증가식으로 돌아감
			}
			if(com>user)
			{
				System.out.println("입력값보다 큰 수를 입력해주세요");
			}
			else if(com<user)
			{
				System.out.println("입력값보다 작은 수를 입력해주세요");
			}
			else
			{
				System.out.println("정답입니다~");
				System.exit(0); //프로그램 종료
			}
		}
		

	}

}
