//5~16까지의 합을 구하시오

public class 문제7while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=5;
		while(i<=16)
		{
			sum+=i;
			i++;
		}
		System.out.println("5~16까지의 합은:"+sum);
	}

}
