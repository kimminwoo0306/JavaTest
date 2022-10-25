/*
 * 
 * 
 * 
 * 3-1) 중첩 if ==> && ===> 게임에서 자주등장
 * 		int a=10;
 * 	    int b=20;
 * 	    if(a==10 && b==20)
 * 
 *      if(a==10)
 *      {
 *      	if(b==20)
 *      	{
 *      		실행문장
 *      	}
 *      }
 *      
 *      웹
 *      	if(로그인이 되었다면) ==> 메뉴변경, 권한
 *          {
 *          	if(어드민)
 *          	{
 *          	}
 *          	else
 *          	{
 *          		사용자라면
 *          	}
 *          }
 *          
 *          1. 가독성
 *          2. 최적화
 *          3. 간결화
 *          
 *  4) 선택문 : 조건을 제시하는 것이 아니라 ==> 값을 한개 선택(키보드, 점수) : 네트워크, 게임, 메뉴처리
 *     page146
 *  	형식)
 *          switch(정수, 문자, 문자열) ==> 다중조건문과 비슷
 *          {
 *           case 값:
 *              처리문장
 *           case 값:
 *              처리문장
 *           case 값:
 *              처리문장      
 *          }
 *          
 *          switch(no)
 *          {
 *             case 1:
 *               처리문장 1;
 *               break;
 *             case 2:
 *               처리문장 2;
 *               break;
 *             case 3:
 *               처리문장 3;
 *             case 4:
 *               처리문장 4;
 *               break;
 *             default: 해당 번호가 없는 경우에 사용 ==> 생략 가능
 *          }
 *          ===>1,2,3,4 수행             
 */
//사칙연산, 학점
import java.util.Scanner;
public class 조건문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// +, -, *, /
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		switch(scan.next()) //문자열
		{
		case "+":
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			break;//switch 종료
		case "-":
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			break;
		case "/":
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다."); //오류처리
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
			break;
		default:
			System.out.println("+,-,*,/를 입력하세요!");
		}
	}

}
