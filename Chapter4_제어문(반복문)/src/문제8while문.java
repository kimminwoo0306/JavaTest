//8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.

public class 문제8while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int i=3;
		while(i<=4462)
		{
			if(i%2==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println("3이상 4462이하에서 짝수인 정수의 합은: "+sum);
	}

}
