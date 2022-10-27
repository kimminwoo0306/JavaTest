/*
 *     정수 1개 입력받아서 +5한 값을 저장후에 다시 출력
 */
import java.util.Scanner;
public class 대입연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		//num=num+5;
		num+=5;
		System.out.println("num="+num);
		// num=15 ==> -5한 값을 저장후에 출력
		//num=num-5;
		num-=5;
		System.out.println("num="+num);
		// num=10 ==> -5한 값을 저장후에 출력
		//num=num*5;
		num*=5;
		System.out.println("num="+num);
		// num=50 => *5한 값을 저장후에 출력
		//num=num/5
		num/=5;
		System.out.println("num="+num);
		// num=10 => /5한 값을 저장후에 출력
		//num=num&5;
		num&=5;
		System.out.println("num="+num);
		// num=0 => &5한 값을 저장후에 출력
		//num=num|5;
		num|=5;
		System.out.println("num="+num);
		//num=5 => |5한 값을 저장후에 출력
		//num=num^5;
		num^=5;
		System.out.println("num="+num);
		//num=0 => ^5한 값을 저장후에 출력
		//num=num<<5;
		num<<=5;
		System.out.println("num="+num);
		//num=0 => <<5한 값을 저장후에 출력
		//num=num>>5;
		num>>=5;
		System.out.println("num="+num);
		//num=0 => >>5한 값을 저장후에 출력
	}

}
