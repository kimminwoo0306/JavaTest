//   1~100까지  for(i=1;i<=100;i++) = 총합, 짝수합, 홀수합
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0, even=0, odd=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				even+=i;
				System.out.printf("even=%d,i=%d\n",even,i);
			}
			else
			{
				odd+=i;
				System.out.printf("odd=%d,i=%d\n",odd,i);
			}

			total+=i;
		}
		System.out.println("1~100까지 총합: "+total);
		System.out.println("짝수의 총합: "+even);
		System.out.println("홀수의 총합: "+odd);
		System.out.println("=======================================");
		
		//3의 배수(a3), 5의 배수(a5), 7의 배수의 합(a7)
		int a3=0, a5=0, a7=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				a3+=i;
			if(i%5==0)
				a5+=i;
			if(i%7==0)
				a7+=i;

		}
		System.out.println("3의 배수의 총합: "+a3);
		System.out.println("5의 배수의 총합: "+a5);
		System.out.println("7의 배수의 총합: "+a7);
	}

}
