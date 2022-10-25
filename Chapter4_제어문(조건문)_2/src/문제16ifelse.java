import java.util.Scanner;

/*
 * 16)	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울
 * 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
 * if-else 문과 switch 둘 다 이용해 볼 것.
 */
public class 문제16ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("달을 입력하세요: ");
		int month=scan.nextInt();
		
		if(month==12 || month<=2)
			System.out.println("겨울");
		else if(month<=5 && month>2)
			System.out.println("봄");
		else if(month<=8 && month>5)
			System.out.println("여름");
		else if(month<=11 && month>8)
			System.out.println("가을");
		else
			System.out.println("잘못 입력했습니다.");
	}

}
