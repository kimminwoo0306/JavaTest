import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) // 맨처음 발생된 난수 제외
			{
				if(lotto[i]==lotto[j])
				{
					i--; // 저장하지 않는다.
					break; // 다시 1차 for문으로 => 난수발생
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		

	}

}
