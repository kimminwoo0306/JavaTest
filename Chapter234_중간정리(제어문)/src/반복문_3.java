
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // A ~ Z == for, while
		char c='A';
		System.out.println("====== for문 ======");
		for(c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("====== while문 ======");
		// c='Z'+1
		c='A'; // 다시 초기화 시켜준다.
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}
		c='A';
		System.out.println();
		System.out.println("====== do~while문 ======");
		do
		{
			System.out.print(c+" ");
			c++;
		}while(c<='Z');
	}

}
