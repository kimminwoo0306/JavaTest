import java.util.Arrays;

/*
 * 4. 양의 정수 10개 입력받아 배열에 저장하고
 * 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
 */
public class 배열문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10개 저장하는 공강
		int[] num=new int[10];

		//초기화
		for(int i=0; i<num.length;i++)
		{
			num[i]=(int)(Math.random()*100)+1;
		}
		//화면출력
		System.out.println(Arrays.toString(num));
		for(int i:num)
		{
			if(i%3==0)
				System.out.print(i+" ");	
			/* for문
			 * 
			 * for(int i=0; i<num.length;i++)
				{
					if(num[i]%3==0)
					{
					System.out.print(num[i]+" ");
					}

				}

			 */

		}

	}
}