/*
 * 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)
 */
import java.util.Scanner;
public class 제어문_연습문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수 : ");
		int kor=scan.nextInt();
		System.out.println("영어 점수 : ");
		int eng=scan.nextInt();
		System.out.println("수학 점수 : ");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/(double)3;
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		char grade=' ', opt ='0';
		
		if(avg>=90)
		{
			grade='A';
			if(avg>=95)
			{
				opt = '+';
			}
			else if(avg<94)
			{
				opt = '-';
			}
			else if (avg>=80)
			{
				grade='B';
				if(avg>=85)
				{
					opt ='+';
				}
				else if(avg<84)
				{
					opt='-';
				}
				
			}
		}
		System.out.printf("당신의 학점은 %c%c입니다.\n",grade,opt);
	}

}
