package amazon;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import amazon.util.ProductCrawler;

public class OtherTest {
	private static final Logger logger = Logger.getLogger(OtherTest.class);

	public static void main(String[] args) throws IOException {
//		Document doc = Jsoup.connect("http://www.amazon.com/gp/product/B0055QZ216").get();
//		String[] productArray = {"B0055QZ216","B000IE8Z4Q","B002UJGK1C"};
//		for (String asin:productArray){
//			 System.out.println(ProductCrawler.getProductByAsin(asin));		
//		}
//	   private static final Logger logger = LoggerFactory.getLogger(OtherTest.class);  
	   logger.info("I'm starting");
	   // аЌзг: B005FI5OA8
	   // ЪѓБъ:B0055QZ216
       System.out.println(ProductCrawler.getProductByAsin("B005FI5OA8"));
	}
	

}
