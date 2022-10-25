/*
 *   반복문 : 같은 형태 여러개인 경우에 사용하는 제어문
 *         ***= for : 반복 횟수가 지정되어 있으면 사용
 *                1    2
 *           for(초기값;조건식;증감식)  => 화면 UI에 자주 사용
 *           {
 *           	반복 수행 문장
 *           }
 *           
 *         ***= while : 반복 횟수가 없는 경우 => (데이터베이스에 자주사용)
 *           초기값---1
 *           while(조건식)---2
 *           {
 *           	수행문장
 *           	증감식
 *           }
 *         ------------------------------- 수행을 안할 수 있다
 *         
 *         = do~while : 한번 이상을반드시 수행
 *         초기값  -----1
 *         do
 *         {
 *         		실행문장---2
 *         		증가식 ---3
 *         }while(조건식);
 *         
 *         조건 검색 => 선 조건, 후 조건
 *         
 *         page 156
 *         
 *         for => 일반 for
 *         		  forEach(웹에서 사용) => map, foreach, for of, for in
 *              ------------------- 배열/컬렉션
 *              
 *         for
 *         1) 형식
 *                 1  →  2 ←   4
 *            for(초기값;조건식;증감식)
 *                     3    ↗
 *                  반복수행문장
 *                  
 *                1부터 10번 수행
 *                
 *                for(int i=1;i<=10;i++)
 *                {
 *                	반복문장
 *                }
 *                
 *                100번 수행
 *                for(int i=0;i<100;i++)
 *                for(int i=1; i<=100;i++)
 *                A~Z
 *                for(char c='A'; c<='Z';c++)
 *                           'a'     'z'
 *               *** 무한 루프 for(;;)
 *               
 *               int[] arr={1,2,3,4,5,6,7}
 *               for(int a:arr)
 */
// 2~9까지 정수 입력을 받아서 해당 단을 출력하는 프로그램
//import java.util.Scanner;
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
		int dan=(int)(Math.random()*8)+2;
		System.out.println(dan+"단");
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%2d*%2d=%2d\n",dan,i,dan*i);
		}
		//System.out.print("알고싶은 숫자의 단을 입력하세요");
		// int dan=scan.nextInt();
		/*for(int i=1;i<=9;i++)
		{
			System.out.printf("%2d*%2d=%2d\n",dan,i,dan*i);
		}
		*/
	}

}
