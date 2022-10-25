import java.util.Scanner;
public class 제어문_연습문제3다른풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade,score;
		grade=(int)(Math.random()*4)+1;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력(0~100): ");
		score=scan.nextInt();
		
		if(score>=0 && score<=100)
		{
			if(grade==4)
			{
				if(score>=70)
				{
					System.out.println("합격입니다."+grade+"학년");
				}
				else
				{
					System.out.println("불합격입니다."+grade+"학년");
				}
			}
			else
			{
				if(score>=60)
				{
					System.out.println("합격입니다."+grade+"학년");
				}
				else
				{
					System.out.println("불합격입니다."+grade+"학년");
				}
			}
		}
		else
		{
			System.out.println("경고!! 잘못된 입력입니다.");
		}
	}

}
