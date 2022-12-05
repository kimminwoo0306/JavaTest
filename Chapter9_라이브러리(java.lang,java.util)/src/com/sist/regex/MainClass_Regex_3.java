package com.sist.regex;
import java.io.IOException;
/*
 * <div class="thumb_cont">
      <strong class="tit_item">
         <a href="/moviedb/main?movieId=149380" class="link_txt" data-tiara-layer="moviename">�û���</a>
      </strong>
 */
import java.util.*;
import java.util.regex.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class MainClass_Regex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] movie= {
				"�û��� ��ȭ",
				"����Ƽ �帲 �� ����",
				"�� �Ҽ�: ��ĭ�� ������",
				"����",
				"�����ڵ�",
				"���ú�",
				"��Ʈ������ ����",
				"���ǽ� �ʸ� ����",
				"â���� �ܿ�",
				"��: 600����"
		};
		Scanner scan=new Scanner(System.in);
		System.out.println("============== ��ȭ ��� ===============");
		for(int i=0;i<movie.length;i++)
		{
			System.out.println((i+1)+"."+movie[i]);
		}
		System.out.println("=====================================");
		System.out.print("��ȭ ����: ");
		int movieID=scan.nextInt();
		
		String title=movie[movieID-1];
		System.out.println("���õ� ��ȭ��: "+title);
		try
		{
			String url="https://www.youtube.com/results?search_query="+title;
			Document doc=Jsoup.connect(url).get();
			String pattern="/watch\\?v=[^��-Ş]+";
			String data=doc.toString();
			Pattern p=Pattern.compile(pattern);
			Matcher m=p.matcher(data);
			String key="";
			int i=0;
			while(m.find())
			{
				if(i==1)
				{
					key=m.group();
					break;
				}
				i++;
			}
			key=key.substring(key.indexOf("=")+1, key.indexOf("\""));
			//System.out.println(key);
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://youtube.com/embed/"+key);
		} catch (Exception ex) {}
	}

}
