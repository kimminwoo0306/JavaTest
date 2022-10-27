/*
 * 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

 */

import java.util.Scanner;
public class 문제6while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num1=0, num2=0;
		
		while(true)
		{
			System.out.println("시작 값 입력: ");
			num1=scan.nextInt();
			System.out.println("끝 값 입력");
			num2=scan.nextInt();
			if(num1<num2)
				break;
		}
			
		int total=1;
		
		int a=num1;
		while(a<=num2)
		{
			total *=a;
			a++;
		}
		System.out.println("시작 값 "+num1+"부터 끝 값 "+num2+"까지의 곱의 값은 : "+total);
	}

}

