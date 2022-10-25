/*
 *   90~100 A
 *   80~89  B
 *   70~79  C
 *   60~69  D
 *   60미만  F
 */
import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3개 정수(국어,영어,수학) 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("국어,영어,수학 점수를 입력하세요:");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		//총점
		int total=kor+eng+math;
		//평균
		double avg=total/3.0;
		
		//학점
		char score=' ';
		switch((int)(avg/10))
		{
		    // if(avg==10 || avg==9)
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
		}	

		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		System.out.println("총 점수: "+total);
		System.out.printf("평균점수: %.2f\n",avg);
		System.out.println("학점: "+score);
	}

}
