/*
 *  14. 다음 결과를 출력하는 프로그램 작성
 *       1 1 1 1 1
 *       2 2 2 2 2
 *       3 3 3 3 3
 *       4 4 4 4 4
 *       5 5 5 5 5
 */
public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(k);
			}
				k++;
				System.out.println();
			}
		
	}

}

