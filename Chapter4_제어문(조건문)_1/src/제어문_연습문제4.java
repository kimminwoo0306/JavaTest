/*
 * 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
         합계와 평균을 구해보자.
 */
import java.util.Scanner;
public class 제어문_연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 : ");
		int a=scan.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		int b=scan.nextInt();
		System.out.println("세번째 정수를 입력하세요 : ");
		int c=scan.nextInt();
		
		int max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		System.out.println("최댓값은 "+max+" 입니다.");
		
		int min=a;
		if(min>b) min=b;
		if(min>c) min=c;
		System.out.println("최솟값은 "+min+" 입니다.");
		
		int total=a+b+c;
		System.out.println("세 정수의 합계는 "+total+" 입니다.");
		
		double avg=total/3.0;
		System.out.println("세 정수의 평균은 :"+avg+" 입니다.");
			

	}

}
