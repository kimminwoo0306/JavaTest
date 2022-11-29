/*
 * 5. 정수를 10개 저장하는 배열을 만들고
 * 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
 * 그리고 배열에 든 숫자들과 평균을 출력하라. 
 */
public class 배열문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 10개 저장하는 배열 만들기
		int[] num=new int[10];
		int total=0;
		double avg=0;
		// 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장
		for(int i=0; i<num.length; i++)
		{
			num[i]=(int)(Math.random()*10)+1;
			System.out.print(num[i]+" "); // -> System.out.pritnln(Arrays.toString(num));
			total+=num[i];
			avg=total/10.0;

		}
		//총합
		/*
		 * for(int i:num)
		 * {
		 * 	total+=i;
		 * }
		 */
		System.out.println();
		System.out.println("총합 :"+total);
		System.out.println("평균 : "+avg); // System.out.printf("평균:%.2f\n",total/(double)num.length);

	}
}
