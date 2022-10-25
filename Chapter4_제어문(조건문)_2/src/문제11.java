import java.util.Scanner;

/*
 * 11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
 * 갈색 = 지역변수, 파란색 = 멤버변수
 */
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		//int num=(int)(Math.random()*100)+1; // 무작위 1~100까지 수
		int num=scan.nextInt();
		int sum=0;
		for(int i=1; i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+num+"까지의 합: "+sum);	
	}

}
