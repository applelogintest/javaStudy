
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 * 	<div class="wrap_movie">
 	<div class="info_tit">
		<em class="ico_movie ico_allrating">전체관람가</em>
		<a href="/moviedb/main?movieId=93004" class="name_movie #title">겨울왕국 2</a>
								</div>
 */
public class 배열3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Movie[] m= new Movie[16];
		Document doc = Jsoup.connect("https://movie.daum.net/premovie/released").get();
		Elements link = doc.select("div.info_tit a.name_movie"); // 데이터가 많을때 Elements
		int k=1;
		
		for(int i=0; i<link.size(); i++)
		{
			try{
			//System.out.println(link.get(i).attr("href"));
			String link_data="https://movie.daum.net"+link.get(i).attr("href"); 
			System.out.println(link_data);
			
			Document doc2 = Jsoup.connect(link_data).get();
			/*
			 * <div class="subject_movie">
								<strong class="tit_movie">겨울왕국 2 (2019)</strong>
								<span class="txt_origin">Frozen II</span><!-- 2016-04-12 추가 -->
								
				<a href="/moviedb/grade?movieId=93004" class="raking_grade">
									<span class="bg_star star_grade"><span class="bg_star inner_star" style="width:74.15000081062317%">평점</span></span> <!-- 116px이 100%, % 계산에서 width값에 적용-->
									<em class="emph_grade">7.4</em>
									
				<dl class="list_movie list_main">
								<dt class="screen_out">장르|나라</dt>

																								
								<dd class="txt_main">애니메이션/어드벤처/코미디/판타지/뮤지컬</dd>

																<dd>
																			미국																	</dd>
				<div class="detail_summarize">
						<span class="thumb_summary #info #poster">
															<img src="//img1.daumcdn.net/thumb/C155x225/?fname=http%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F5afd212b68e34e61a964d969dd898e2f1574298873981" class="img_summary" alt="겨울왕국 2 포스터" onload="noImageOnLoad($(this));">
													</span>			
																											
			 */
			Element title_kr=doc2.selectFirst("div.subject_movie strong.tit_movie");
			Element title_en=doc2.selectFirst("div.subject_movie span.txt_origin");
			Element score= doc2.selectFirst("a.raking_grade em.emph_grade");
			Element genre = doc2.select("dl.list_main dd.txt_main").get(0);
			Element regdate = doc2.select("dl.list_main dd.txt_main").get(1);
			Element grade = doc2.select("dl.list_main dd").get(3);
			Element director = doc2.select("dl.list_main dd").get(4);
			Element actor = doc2.select("dl.list_main dd").get(5);
				
			/*
				 * System.out.println("count :" +(k)); System.out.println(title_kr.text());
				 * System.out.println(title_en.text()); System.out.println(score.text());
				 * System.out.println(genre.text()); System.out.println(regdate.text());
				 * System.out.println(grade.text()); System.out.println(director.text());
				 * System.out.println(actor.text());
				 * System.out.println("==============================");
				 */
			
			//긁어온 값 저장
			m[i]=new Movie(); // 클래스 저장
			m[i].title_kr=title_kr.text();
			m[i].title_en=title_en.text();
			m[i].score = Double.parseDouble(score.text());
			m[i].grade = grade.text();
			m[i].genre = genre.text();
			m[i].regdate = regdate.text();
			m[i].director = director.text();
			m[i].actor = actor.text();
			
			k++;
			}catch(Exception ex) {k--;}	
		}
		
		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("영화번호 선택 (0~15):");
		 * 
		 * int index=scan.nextInt(); System.out.println("========== 결과 ===========");
		 * System.out.println("영화명: "+m[index].title_kr);
		 * System.out.println("감독: "+m[index].director);
		 * System.out.println("출연: "+m[index].actor);
		 * System.out.println("개봉일: "+m[index].regdate);
		 * System.out.println("장르: "+m[index].genre);
		 */
		double max=0.0;
		
		
		  for(int i=0; i<m.length; i++)
		  { 
			  if(m[i]!=null)
			  {

				  if(max < m[i].score) 
				  { 
					  max=m[i].score;
				  }
			  }
		 
		  }
		  for(int i=0; i<m.length; i++)
		  {
			  if(m[i]!=null)
			  {
				  if(m[i].score==max)
				  {
					  System.out.println(m[i].title_kr);
				  }
			  }
		  }
		  //System.out.println(max);
	 }
		 
		
}
		
	

