import java.util.Scanner;

public class 제어문_반복문5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("1. 메모장, 2. 그림판, 3. 브라우저, 4. 종료: ");
			int no = scan.nextInt();

			if (no < 1 || no > 4) {
				System.out.println("숫자를 다시 입력해주세요.");
				continue;
			}
			switch (no) {
			case 1:
				Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
				break;
			case 2:
				Runtime.getRuntime().exec("C:\\Windows\\System32\\mspaint.exe");
				break;
			case 3:
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe " +"www.naver.com");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
