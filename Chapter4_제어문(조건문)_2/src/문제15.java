import java.util.Scanner;

/*
 * 15)	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

 */
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99): ");
		int num=scan.nextInt();
		/*int a=num/10;
		int b=num%10;
		if(a==b)
		*/
		if(num%11==0)
		{
			System.out.println("10의 자리와 1의자리의 숫자가 같습니다.");
		}
		else
			System.out.println("10의 자리와 1의자리의 숫자가 다릅니다.");
	}

}
