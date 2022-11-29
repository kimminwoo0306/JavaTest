/*
 * 7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
    A C D H J
     A C D H J
     J H D C A

 */
public class 배열문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c=new char[5];
		for(int i=0;i<c.length;i++)
		{
			c[i]=(char)((Math.random()*23)+65);
		}
	}

}
