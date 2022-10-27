// 알파벳을 입력받아서 대소문자 구분하여  출력
import java.util.Scanner; //외부에 있는 클래스를 읽어올때 사용
public class 논리연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳을 입력하세요: ");
		char c= scan.next().charAt(0); // 입력된 알파벳 1개를 가지고 온다. (Scanner의 단점 : 문자 1개를 못받는다.)
		boolean b1 = c>='A' && c<='Z';
		boolean b2 = c>='a' && c<'z';
		System.out.println("b1="+b1+"=> 대문자");
		System.out.println("b2="+b2+"=> 소문자");
		// (c>'A' && c<='Z') || (c>='a' && c<='z') == 알파벳 조건
	}

}
