import java.util.Scanner;
public class 구구단원하는단출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요: ");
		int num=scan.nextInt();
		
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",num,i,num*i);
		}
	}

}
