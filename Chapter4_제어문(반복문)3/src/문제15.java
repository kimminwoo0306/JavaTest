/*
 *  다음 결과를 출력하는 프로그램 작성
 *  
 *      1 2 3 4 5
 *      1 2 3 4 5 
 *      1 2 3 4 5 
 *      1 2 3 4 5 
 *      1 2 3 4 5  
 */
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		for(int i=1;i<=5;i++)
		{
			int k=1;
			for(int j=1;j<=5;j++)
			{
				System.out.print(k++);
			}
				System.out.println();
		}
	}

}
