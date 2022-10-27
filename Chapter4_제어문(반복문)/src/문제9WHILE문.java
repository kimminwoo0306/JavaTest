/*
 * 9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.

 */
public class 문제9WHILE문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=0;
		while(i<=12)
		{
			if(i%2==0)
				sum+=i;
			else if(i%3==0)
				sum+=i;
			i++;
		}
		System.out.println("0~12까지 2의배수, 3의배수의 합은: "+sum);
	}

}
