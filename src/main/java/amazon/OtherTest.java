package amazon;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class OtherTest {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://www.amazon.com/gp/product/B0079KAVN0").get();
		Elements newsHeadlines = doc.select("#productTitle");
		System.out.println(newsHeadlines.text());
		
		Elements sizeList = doc.select("#native_dropdown_selected_size_name option");
		System.out.println(sizeList.html());
		
		System.out.println("--------");
		Elements quantity = doc.select("#quantity");
		System.out.println(quantity.html());
//		System.out.println(newsHeadlines.to);
//		Iterator<Element> elementIter = newsHeadlines.iterator();
//		while(elementIter.hasNext()){
//			Element nextElement = elementIter.next();
//			System.out.println(nextElement.text());
//		}
//		System.out.println(newsHeadlines.html());
		
//		Document
		

	}

}
