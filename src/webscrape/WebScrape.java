/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscrape;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author AreeshaJiwani
 */
public class WebScrape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
                int i = 0;
                Document doc = Jsoup.connect("https://www.imdb.com/chart/top").timeout(6000).get();
		Elements body = doc.select("tbody.lister-list");
                System.out.println("IMDB MOVIES LIST: ");
                System.out.println();
		for(Element e : body.select("tr"))
		{
                        i++;
			String title = e.select("td.posterColumn img").attr("alt");
			System.out.println(i + "  " + title);
		}
    }
        
  }
    

