package com.sist.generics;
import java.util.*;
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
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
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	// 초기화 => 매개변수가 있는 생성자를 사용한다
	public Sawon(int sabun, String name, String dept, String loc, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	public Sawon() {} // default 생성자
	// 자동으로 생성자를 첨부하지 않는다
	
}
public class MainClass_제네릭스활용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>(); // 가장 많이 사용됨
		// boolean java.util.ArrayList.add(Sawon e)
		list.add(new Sawon(1,"손흥민", "에이스", "토트넘", 300));
		list.add(new Sawon(2,"김민재", "수비수", "나폴리", 300));
		list.add(new Sawon(3,"황희찬", "공격수", "울버햄튼", 300));
		list.add(new Sawon(4,"황인범", "미드필더", "올림피아코스", 300));
		list.add(new Sawon(5,"이강인", "패스마스터", "마요르카", 300));
		
		// 출력
		System.out.println("======== 선수 목록 ========");
		for(Sawon sa:list)
		{
			System.out.println(sa.getSabun()+" "+ sa.getName()+" "+sa.getDept()+" "+sa.getLoc()+" "+sa.getPay());
		}
	}

}
