package com.sist.lang;
class Sawon implements Cloneable
{
	// 캡슐화 코딩 => 데이터는 private, 읽기 쓰기 (getter / setter)
	private String name;
	private String dept;
	private String loc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	// 라이브러리는 예외처리가 필요한 부분은 예측을 해서 설정 => CheckedException : 처리하지 않은경우 에러
}
/*
 *    Object (상위)
 *      |
 *    Sawon (하위)
 *    
 *    
 */
public class 라이브러리_5 {
	// throws CloneNotSupportedException, throws Exception, throws Throwable
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Sawon sa=new Sawon();
		// Sawonsa1=new Sawon()
		sa.setName("홍길동");
		sa.setDept("개발부");
		sa.setLoc("서울");
		// Sawon copy=sa;
		Sawon copy=(Sawon)sa.clone(); // 많이 등장 => 라이브러리 메소드 호출시 대부분 Object
		
		Sawon sa1=new Sawon(); // 초기값
		
		System.out.println("sa: "+sa);
		System.out.println("copy: "+copy);
		System.out.println("sa1: "+sa1);
		
		System.out.println("sa.name: "+sa.getName());
		System.out.println("sa.dept: "+sa.getDept());
		System.out.println("sa.loc: "+sa.getLoc());
		System.out.println("sa1.name: "+sa1.getName());
		System.out.println("sa1.dept: "+sa1.getDept());
		System.out.println("sa1.loc: "+sa1.getLoc());
		System.out.println("copy.name: "+copy.getName());
		System.out.println("copy.dept: "+copy.getDept());
		System.out.println("copy.loc: "+copy.getLoc()); // 아바타
	}

}
