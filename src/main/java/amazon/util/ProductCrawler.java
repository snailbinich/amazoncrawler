package amazon.util;

import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import amazon.OtherTest;
import amazon.model.Product;

public class ProductCrawler {
 
	
	private static final Logger logger = Logger.getLogger(ProductCrawler.class);
	
	public static Product getProductByAsin(String asin) throws IOException {
		Product product = new Product(asin);
		Document doc = Jsoup.connect(Constants.AMAZON_PRODUCT_BASE_URL + asin)
				.get();
		Elements newsHeadlines = doc.select("#productTitle");
		product.setName(newsHeadlines.text());
		Elements quantity = doc.select("#quantity");
		System.out.println(quantity.size());
		if (0 == quantity.size()){
			logger.debug("quantity size is 0");
			//没有显示库存,获取尺寸
			Elements sizeList = doc.select("#native_dropdown_selected_size_name option");
			Iterator<Element> elementIter = sizeList.iterator();
			while(elementIter.hasNext()){
				Element nextElement = elementIter.next();
				System.out.println(nextElement.val());
				
			}
			
		}
		product.setInventory(getQuantity(quantity));
		return product;
	}

	private static int getQuantity(Elements quantity) {

		Iterator<Element> elementIter = quantity.select("option").iterator();
		int result = 0;
		while (elementIter.hasNext()) {
			Element nextElement = elementIter.next();
			int currentNum = Integer.parseInt(nextElement.val());
			if (currentNum > result) {
				result = currentNum;
			}
		}
		return result;

	}

}
