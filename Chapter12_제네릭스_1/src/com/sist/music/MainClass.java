package com.sist.music;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		MusicSystem ms=new MusicSystem();
		System.out.print("지니뮤직(1) 멜론(2) 선택: ");
		int cno=scan.nextInt();
		
		ArrayList<Music> list=ms.musicCategoryData(cno);
		if(cno==1)
			System.out.println("==== 지니뮤직 Top 100 ====");
		else
			System.out.println("==== 멜    론 Top 50 ====");
		
		for(Music m:list)
		{
			System.out.println(m.getMno()+"."+m.getTitle()+" "+m.getSinger());
		}
	}

}
