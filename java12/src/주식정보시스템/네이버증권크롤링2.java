package 주식정보시스템;



import java.io.IOException;



import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class 네이버증권크롤링2 {
//크롤링은 인터넷 문서(html)를 다 받아와서
	//html 문서를 분석을 해서 낵 원하는 정보를 추출하는 것.
	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1.네트워크 연결 성공." + con);
		
		Document doc = null;
		try {
			doc = con.get();
			Elements codeList = doc.select(".code"); //<a class="nav">
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
			
			//sptxt sp_txt9 ==> [tag, tag, tag, ....]
			Elements textList = doc.select(".sptxt.sp_txt9"); //<a class="nav">
			System.out.println(textList.size());
			
			Element tag2 = textList.get(0);
			String text1 = tag2.text();
			System.out.println("text1 " + text1);
			
			Elements textList2 = doc.select(".sptxt.sp_txt10"); //<a class="nav">
			System.out.println(textList2.size());
			
			Element tag3 = textList2.get(0);
			String text2 = tag3.text();
			System.out.println("text2 " + text1);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
