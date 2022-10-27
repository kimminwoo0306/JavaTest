/*
 * 
 */
public class 반복문_중첩For문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
				System.out.printf("%2d*%2d=%2d\t",i,j,j*i);
			System.out.println();
		}
	}

}
