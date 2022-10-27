/*
 *   1####
 *   #2###
 *   ##3##
 *   ###4#
 *   ####5
 *   
 *   ☆☆☆☆★
 *   ☆☆☆★☆
 *   ☆☆★☆☆
 *   ☆★☆☆☆
 *   ★☆☆☆☆
 *   ★☆☆☆★
 *   ☆★☆★☆
 *   ☆☆★☆☆
 *   ☆★☆★☆
 *   ★☆☆☆★
 *   
 */
public class 반복문_중첩For문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print("#");
			}
			System.out.println();*/
		
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(6-i==j)
					System.out.print('★');
				else
					System.out.print('☆');
			}
			System.out.println();
		}*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(6-i==j || i==j)
					System.out.print('★');
				else
					System.out.print('☆');
			}
			System.out.println();
		}

	}

}
