import java.util.Scanner;

/*
 * 16)	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
 * 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
 * if-else 문과 switch 둘 다 이용해 볼 것.
 */
public class 문제16switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요: ");
		int month = scan.nextInt();
                                                //   ↗라벨
		// case뒤에 라벨이 붙는데, 라벨은 중복이 되면 안됨 case 1:
		// 라벨은 실수사용 불가하며 정수, 문자, 문자열 사용가능
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("값을 잘못 입력했습니다.");

		}
	}

}
