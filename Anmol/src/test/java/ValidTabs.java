//This is to test the Valid tabs Issue

//we will be creating a function which will accept the tab link

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ValidTabs {
	static WebDriver driver=new ChromeDriver();
	///System.setProperty(" "," ");
	
//Now, we will be passing the tagNames into a function
	
	File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //taking screenshot in file format
	//Copy Screenshot to desired Location
	File Dest=new File("dest");
	//FileUtils.copyFile();
	
	
	
	//Connection-- OpenConnection, Timeout.. COnnect... EnD he COnnection
	
	
	

	public static void Main(String args[])
	{
		try {
			List<WebElement> LINKS=driver.findElements(By.tagName("a"));
			for(WebElement Link:LINKS)
			{
			String LinkName=Link.getAttribute("href");
			URL url=new URL(LinkName);
			URLConnection con=url.openConnection();
			HttpURLConnection http=((HttpURLConnection)con);
			http.setConnectTimeout(5000);
			http.connect();
			
			
			
			
			
			if(http.getResponseCode()>=400) 
			{
				System.out.println("Broken link");
			}
			else
			{
				System.out.print("Its not a Broken Link");
			}
			}
		}
			
			
			
		 catch (IOException e) {
			
		}
			
		}
		
		 
		
	}
	


