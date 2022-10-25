
/*
 * 1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!
 */
import java.util.Scanner;

public class 제어문_연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("학년을 입력하세요(1,2,3,4) :");
		int grade = scan.nextInt();

		System.out.println("점수를 입력하세요 :");
		int score = scan.nextInt();

		if (score > 0 && score < 100)
		{
			if(grade==4)
			{
				if(score>=70)
				{
					System.out.println("합격입니다.");
				}
				else
				{
					System.out.println("불합격입니다.");
				}
			}
			else
			{
				if(score>=60)
				{
					System.out.println("합격입니다.");
				}
				else
				{
					System.out.println("불합격입니다.");
				}
			}
		}
		else
		{
			System.out.println("경고입니다");
		}

	}

}
