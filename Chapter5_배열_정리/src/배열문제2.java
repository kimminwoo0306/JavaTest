/*
 * 2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다.
 * (실적 0~100)
 * 1) 사번별 실적을 출력하시오.
 * 사원(1) 50
 * ..
 * 2) 1월 실적의 총점과 평균을 출력하시오.
 * 3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
 */
public class 배열문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {50,45,35,12,70};
		int total=0;
		int big=0;
		int small=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("사원("+(i+1)+"): "+arr[i]);
			total+=arr[i];
		}
		
		/*
		 * for(int i:arr)
		 * {
		 * 	total+=i;
		 * }
		 */
		System.out.println("총점: "+total);
		System.out.println("평균: "+total/(double)arr.length);
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];  //최대실적
				big =i+1;    //최대사원번호
			}
			else if(min>arr[i])
			{
				min=arr[i];  //최소실적
				small=i+1;   //최소사원번호
			}
				
		}
		//가장 큰 실적을 가지고 있는 사번
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				big=i;
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==min)
			{
				small=i;
				break;
			}
		}
		*/
		System.out.println("사원("+big+")번, 실적: "+max);
		System.out.println("사원("+small+")번, 실적: "+min);

	}

}
