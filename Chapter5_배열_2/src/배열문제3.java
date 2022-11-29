import java.util.Arrays;

/*
 * 3. 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오
 * 		char[] alpha = {'a', 'b', 'c', 'd'};
 * 		for(                              )
		     System.out.print(alpha[i]+" ");
 */
public class 배열문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = {'a', 'b', 'c', 'd'};
		//일반 for문
		for(char i=0; i<alpha.length;i++  )
		     System.out.print(alpha[i]+" ");
		System.out.println();
		//forEach문
		for(char c:alpha)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		//배열 내용 출력하기(Arrays.toString())
		System.out.println(Arrays.toString(alpha));

	}

}
