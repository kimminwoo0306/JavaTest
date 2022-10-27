/*
 *    for/while
 *    A~Z출력
 */
public class 반복문_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='A';c<='Z';c++)
			System.out.print(c+" ");
		
		System.out.println();
		
		char c='A';
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}

	}

}
