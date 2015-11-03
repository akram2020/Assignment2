import org.jsoup.*;
import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class myscraping {

    public static void main(String[] args) {
        
       try{
            
        Document urltest = Jsoup.connect("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html").get();  
        String content = urltest.title(); 
        Element data1 = urltest.getElementById("mytable");
        Elements data2 = data1.getElementsByTag("tr");
        
        
        
            
            for (Element info : data2) 
            {
                Elements dataout = info.getElementsByTag("td");
               
                for (int i = 0; i < dataout.size(); i++) 
                {
                      if (i == 1)
                      {
                          System.out.println(dataout.get(i).text());
                      }
               
                }
            
            }
        
          
        System.out.println("-------- THE TITLE : " + content + "--------");    
            
        }
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }       
}