// continue => 제외
// 1-10까지 출력  5,9 제외
public class 반복제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==9)
				continue;
		System.out.print(i+" ");
		}
		
		System.out.println();
		
		//while 무한루프 걸림
		int i=1;
		while(i<=10) // continue 사용할때는 조건식이 true나오게(범위없는값)
		{
			if(i==5 || i==9)
				continue;
			System.out.print(i+" ");
			i++;
		}
	}

}
