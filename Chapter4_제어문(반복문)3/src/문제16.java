/*
 *  16. 다음 결과를 출력하는프로그램 작성
 *  
 *         ★
 *        ★★
 *       ★★★
 *      ★★★★
 *   ----------------------
 *      ★★★★
 *       ★★★
 *        ★★
 *         ★
 *   -----------------------
 *         ★
 *        ★★★
 *       ★★★★★
 *      ★★★★★★★    
 */
public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		for(int i=1; i<=4;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		for(int i=1; i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		

	}

}


/*
 *    1. 형식
 *    2. 2차 for ==>
 *        for()
 *        {
 *        	for(;조건문;)
 *               ----- 핵심
 *          {
 *          }
 *        } 
 *    3. 변수의 위치 설정, 증가식
 */
