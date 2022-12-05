import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 *        java.lang
 *          = Object : �ֻ��� Ŭ���� (��� Ŭ������ ����� ������ Ŭ����) => �ֻ��� ��������
 *            -> Object[] obj={"ȫ�浿", 30, 187.5, 'A', new Saran()....};
 *            -> 1) �Ҹ��� (�޸� ����) => finalize() => GC�� ȣ��
 *                   ����) protected void finalize()
 *               2) ���� => �ִ� �� �״�� ���ο� �޸𸮸� ���� => clone() => prototype
 *                   ����) protected Object clone()
 *                       �޼ҵ��, ���, ������, �Ű�����
 *                       -----------------------
 *               3) ��ü �� => equals() ==> �ּҰ����� �� (�⺻�� ==, ������ equals())
 *                   ����) public boolean equals (Object obj)
 *                        ������ => �������̵� (����) ==> String���� ���� ����� ���ڿ�
 *               4) ���ڿ� ��ȯ => toString() ==> ������ �� �ִ�(��ü�� ���)
 *                  A a=new A(); => System.out.println(a) -> a.toString()
 *                    ����) public String toString() : ��ü�� �ּҰ� ���, ��ü�� ��������� �� ��� (�������̵�)
 *               5) ��� Ŭ�������� extends Object�� �����Ǿ� �ִ�.
 *               6) java.lang�� import ������ �����ϴ�
 *          = String : ���ڿ� ����
 *            1) ���ڿ� ���� ���
 *               String s=""; => ���ڿ��� �ּҸ� ��� ���
 *               String s=new String(""); => ���ο� �޸𸮿� ���ڿ��� �����ϴ� ���
 *               => �������� => �⺻������� �Ѵ�
 *                  �ּҸ� ����, ���� ������
 *                  => Call By Reference, Call By Value
 *            2) equals : ���ڿ� �� => �α��� (id,pwd), ���̵� �ߺ�, ���̵� ã��, ��й�ȣ
 *               ����) public boolean equals(String s) => ��ҹ��� ����
 *            3) contains : ���ڰ� ���� => �˻���
 *               ����) public boolean contains(String s)
 *            4) startsWith : ���� ���ڿ��� ������ ���� : ��Ű, ������Ʈ(�ڵ��ϼ�)
 *               ����) public boolean startsWith(String prefix)
 *            5) endsWith : �� ���ڿ��� ������ ���� : ��� �󵵰� ����
 *               ����) public boolean endsWith(String suffix)
 *            6) replace() : ���ڿ�, ���� ���� => ũ�Ѹ�(�̹��� �ּ� => & => �ٸ� Ư�����ڷ� ����)
 *               ����) public String replace(char c1, char c2)
 *                    public String replace(String s1, String s2)
 *            7) replaceAll() : ���Խ��� �̿��ؼ� ����
 *               ����) public String replaceAll(String regex, String s)
 *                                            -------------pattern
 *            8) split : �����ڸ� ���� ���ڿ��� �����ؼ� �迭�� ���� (StringTokenizer)
 *               ����) public String[] split(String regex) => �����ڴ� ���Խ����� ���
 *            9) length : ���� ����
 *               ����) public int length()
 *            10) indexOf : ���ϴ� ��ġ�� ���ڳ� ���ڿ��� ã�� (�տ������� ã��)
 *               ����) public int indexOf(char c)
 *                    public int indexOf(String s)
 *                    ==> �ڹٹ��ڿ��� ���۹�ȣ�� 0������ �����Ѵ�
 *            11) lastIndexOf : ���ϴ� ��ġ�� ���ڳ� ���ڿ��� ã�� (�ڿ������� ã��)
 *               ����) public int lastIndexOf(char c)
 *                    public int lastIndexOf(String s)
 *            12) substring : ���ڸ� �ڸ� ��쿡 ���
 *               ����) public String substring(int s)
 *                    public String substring(int s, int e) -> e�� ���ܵȴ� (e-1����)
 *            13) valueOf : ��� ���������� String���� ��ȯ
 *               ����) public static String valueOf(int a) => double, float,boolean
 *                    String Ŭ������ �����ϰ� static�̴�
 *                    String.valueOf()
 *            
 *          = StringBuffer : ���ڿ� ���ս� ���� ���Ǵ� Ŭ����
 *             ���ڿ� ���� : append()
 *               ����) public StringBuffer append(String s) => �����ε� (double, int ...)
 *             ���ڿ� ��ȯ : toString()
 *               ����) public String toString()
 *                   (String)
 *          = Wrapper
 *             �⺻�� ���������� ���� ����� �� �ְ� Ŭ���������� ���� (��� ���������� Ŭ����ȭ)
 *             = ���׸��� ���, Object�� ��ȯ
 *             = Integer(int) => parseInt()
 *             = Double(double) => parseDouble()
 *             = Boolean(boolean) => parseBoolean()
 *             = Long(long) => parseLong()
 *             �ڽ� / ��ڽ� --- �⺻���� Ŭ�������� ����
 *             --- Ŭ������ �Ϲ� ������ ���� ����
 *             Integer i=10; -- �ڽ�
 *             int ii=i; -- ��ڽ�
 *         
 *          = System : gc()
 *          = Math : random()����, ceil()�ø�, round()�ݿø�
 *        java.util
 *          = StringTokenizer
            = Scanner
 *        java.util.regex
 *          = Pattern
 *          = Matcher
 */
class A
{
	int a;
}
class B
{
	public void change(A aa)
	{
		aa.a=100;
		System.out.println("aa="+aa);
	}
	public void change2(String s)
	{
		s="Hello Java";
	}
}
public class ����_1��_���̺귯�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println("a= "+a);
		B b=new B();
		b.change(a);
		System.out.println(a.a);
		String ss="";
		System.out.println("ss="+ss);
		b.change2(ss);
		System.out.println("ss="+ss);
	}

}
