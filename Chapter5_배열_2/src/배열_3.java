import java.util.Arrays;
/*
 * 		int[] arr={};
 * 		int[] copy=arr;        ==> arr, copy 같은 주소를 제어
 * 
 * 		int a=10;
 * 		int b=a;               ==> a, b 다른 메모리
 */
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] copy=arr;  //Call by Reference (주소에 의한 참조)
		//Call by Value ==> 기본형
		
		// 주소 ==> 주소(같은 메모리를 제어)    --참조
		System.out.println("arr="+arr);
		System.out.println("copy="+copy);
		/*
		 * int a=10;                    --기본형
		 * ing b=a;
		 */
		System.out.println("arr= "+Arrays.toString(arr));
		System.out.println("copy= "+Arrays.toString(copy));
		
		copy[0]=100;
		//arr[0]
		System.out.println("arr= "+Arrays.toString(arr));
		System.out.println("copy= "+Arrays.toString(copy));
	}

}
