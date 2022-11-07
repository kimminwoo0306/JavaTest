package com.sist;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MusicSystem {
	public static Music[] musicList() {
		// TODO Auto-generated method stub
		Music[] music=new Music[200]; // 클래스는 일반변수처럼 배열사용이 가능
		// 필요시에만 데이터 여러개를 모아서 관리 => 클래스 => 메모리에 저장 => 객체(인스턴스)
		try
		{
			int k=0;
			for(int i=1;i<=4;i++)
			{
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20221107&hh=12&rtm=Y&pg="+i).get();
				// HTML => tag <태그명> => Element
				Elements title=doc.select("tr.list a.title");
				Elements singer=doc.select("tr.list a.artist");
				Elements album=doc.select("tr.list a.albumtitle");
				Elements etc=doc.select("tr.list span.rank");
				Elements poster=doc.select("tr.list a.cover img");
				for(int j=0;j<title.size();j++)
				{
					music[k]=new Music();
					music[k].mno=k+1;
					music[k].title=title.get(j).text();
					music[k].singer=singer.get(j).text();
					music[k].album=album.get(j).text();
					String s=etc.get(j).text();
					music[k].state=s.replaceAll("[^가-힇]", "");
					music[k].poster=poster.get(j).attr("src");
				//	music[k].idcrement=Integer.parseInt(s.replaceAll("[^0-9]", ""));
				/*	System.out.println(k+1);
					System.out.println(title.get(j).text());
					System.out.println(singer.get(j).text());
					System.out.println(album.get(j).text());
					System.out.println(etc.get(j).text());
					System.out.println("================================================");*/
					k++;
				}
			}
		}catch(Exception ex) {}
		//실제 데이터 출력
/*		for(int i=0;i<music.length;i++)
		{
			String str="";
			if(music[i].state.equals("유지"))
				str="-";
			else if(music[i].state.equals("상승"))
				str="▲";
			else if(music[i].state.equals("하강"))
				str="▼";
			else
				str="NEW";
			System.out.println((i+1)+"."+str+" "+music[i].title+" "+music[i].singer+" "+music[i].album+" "+music[i].poster);
		}*/
		return music;

	}
}
