/*
 *    ������ ����
 *    --------
 *    class ClassName
 *    {
 *      ----------------------------------
 *       ������� (��������)
 *         = �ν��Ͻ� ����
 *         = Ŭ���� ����, ���� ����
 *      ----------------------------------
 *      void �޼ҵ� ( _______�Ű�����_______ )
 *      {
 *       ------------------------------
 *         ��������
 *       ------------------------------
 *      }
 *    }
 *    =======================================
 *     ����           ������ġ            �����ñ�
 *    =======================================
 *    �ν��Ͻ� ����     Ŭ������
 *              class ClassName
 *              {
 *                -------
 *              }
 *              => Ŭ���� ���� �ȿ� ����
 *                                    �ν��Ͻ��� ����
 *                                    Ŭ���� ����=new Ŭ����();
 *                                           ----- �ݵ�� new�� ���ÿ� ����
 *                                           *** ���� �޸𸮰� �����
 *                                    ����)
 *                                     class ClassName
 *                                     {
 *                                        �������� ������;
 *                                        �������� ������;
 *                                        ...
 *                                        ��) int score;
 *                                           String name;
 *                                           String sex;
 *                                     }
 *    =======================================
 *    Ŭ���� ����      Ŭ������
 *   			class ClassName
 *              {
 *              }
 *              
 *              => Ŭ���� ���� �ȿ� ����
 *                                    �����ϵɶ� �ڵ����� �����Ǵ� ����
 *                                    *** �Ѱ��� �����Ǳ� ������ ��� ��ü�� ������ �ϴ� ����
 *                                    class ClassName
 *                                    {
 *                                          static int a;
 *                                          static int b;
 *                                          static String c,d,e;
 *                                    }
 *                    1) �ν��Ͻ� ����
 *                    2) Ŭ���� ����
 *                    ------------- �⺻ ����Ʈ �ʱ�ȭ
 *                    int => 0
 *                    long => 0L
 *                    float => 0.0F
 *                    double => 0.0
 *                    boolean => false
 *                    Ŭ����: null ( �ּҰ� ���� ���� ) : String name;
 *                    ---------------------------
 *                    => Ŭ���� ���� : �ѹ��� ��� ��ü�� ������ ����(���뺯��)
 *                    => ����
 *                       1) �ν��Ͻ� ����
 *                          ��ü��.����
 *                          --------
 *                       2) Ŭ���� ����
 *                          ��ü��.����
 *                          Ŭ������.���� : Math.random();
 *    =======================================
 *    �Ű�����      �޼ҵ� ��ȣ �ȿ� ����
 *               �޼ҵ��( ----- )
 *                                    �޼ҵ� ȣ���Ŀ� �����͸� �������� ��쿡 �����Ǵ� ����
 *                                    *** ������� ��û���� �޴� ���
 *                                    void display(int a)
 *                                    {
 *                                    }
 *                                    ==> display(10) 
 *                                    *** ȣ���Ŀ� �ڵ����� �޸� ����
 *                                    *** Stack ������ ���� (�޸� ��ü���� ����)
 *    =======================================
 *    ��������       �޼ҵ� ���ȿ� ����
 *                 �޼ҵ��()
 *                 {
 *                  -------
 *                 }
 *                                    �޼ҵ� ȣ��ø��� �����Ǵ� ����
 *                                    display()
 *                                    {
 *                                     int a=0;
 *                                    }
 *                                    *** ��������
 *                                    *** �ݵ�� �ʱ�ȭ�� �ؾߵȴ�
 *    ���� => �⺻��, �迭, Ŭ����
 *          ----------------- ����
 *          �⺻�� : �Ѱ��� �����͸� ������ ����
 *          �迭  : (���õ� ������) ���� �������� �������� ��Ƽ� ����
 *          Ŭ���� : (���õ� ������) �ٸ� �������� ��Ƽ� ����
 *    =======================================
 *    
 *    class Student
 *    {
 *       int hakbun;
 *       String name;
 *       String subject;
 *       ----------------
 *       String schoolName; // �޸𸮿� ����� ����
 *    }
 *    
 *    Student s1 = new Student();  ==> hakbun, name, subject ==> �޸𸮿� ����
 *    s1.hakbun
 *    s1.name
 *    s1.subject
 *    ----------------->
 *    s1.schoolName
 *    Student.schoolName   ===> �޼ҵ�, ���� ==> Ŭ���������� �����ϸ� (static)
 *    ------------------
 *    
 *    String s="Hello Java";
 *    s.substring();
 *    s. trim();
 *    s. length();
 *    String valueOf();
 *    
 */
class Card
{
	int number;
	String image;
	static int width,height;
}
public class ��������_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1=new Card(); // ���� ������ �ٸ��� (�ν��Ͻ� ����)
		card1.number=1;
		card1.image="��";
		card1.width=100;
		card1.height=180;
		Card card2=new Card();	// ���� ������ �ٸ��� (�ν��Ͻ� ����)	
		card2.number=5;
		card2.image="��";
		card2.width=100;
		card2.height=180;
		Card card3=new Card();		// ���� ������ �ٸ��� (�ν��Ͻ� ����)
		card3.number=5;
		card3.image="��";
		card3.width=100;
		card3.height=180;
		Card card4=new Card();		//���� ������ �ٸ��� (�ν��Ͻ� ����) ���� : ��ü��.������
		card4.number=5;
		card4.image="��";
		card4.width=100;
		card4.height=180;
		
		//���
		System.out.println(card1.number);
		System.out.println(card1.image);
		System.out.println(card1.width);
		System.out.println(card1.height);
		
		System.out.println(card2.number);
		System.out.println(card2.image);
		System.out.println(card2.width);
		System.out.println(card2.height);
		
		System.out.println(card3.number);
		System.out.println(card3.image);
		System.out.println(card3.width);
		System.out.println(card3.height);
		
		System.out.println(card4.number);
		System.out.println(card4.image);
		System.out.println(card4.width);
		System.out.println(card4.height);
		
		System.out.println("======================================");
		card1.width=300;
		card1.height=350;
		
		Card.width=450;
		Card.height=500;
		System.out.println("============= card 1 =============");
		System.out.println(card1.width);
		System.out.println(card1.height);
		System.out.println("============= card 2 =============");
		System.out.println(card2.width);
		System.out.println(card2.height);
		System.out.println("============= card 3 =============");
		System.out.println(card3.width);
		System.out.println(card3.height);
		System.out.println("============= card 4 =============");
		System.out.println(card4.width);
		System.out.println(card4.height);
		
		//static ==> �޸� ������ ���� => �����޸�
		/*
		 *   �ν��Ͻ� ������ ��ü�� ������ �� ��ü���� ���� �ٸ� �޸𸮸� �����ϱ� ������ �ٸ� ���� ���� (***)
		 *    Ŭ���� ������ ���� ������ 1���� �����Ǳ� ������ �׻� ���� ���� �����Ѵ� 
		 */
	}

}







