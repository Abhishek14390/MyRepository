import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewClass {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Sel\\Gecko\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		driver.manage().window().maximize();
		 /*driver.findElement(By.xpath(".//*[@id='check2']")).click();
		 WebElement chk_box=driver.findElement(By.xpath(".//*[@id='check2 ']"));
		 
		 chk_box.click();*/
		
		WebElement table=driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/table/tbody"));
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		WebElement row=driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[1]"));
		List<WebElement> allColumns=row.findElements(By.tagName("td"));

		System.out.println(allRows.size());
		System.out.println(allColumns.size());
		
		//.//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[1]/td[1]
		
		String s1=".//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[";
		String s2="]/td[";
		String s3="]";
		
		for(int i=1;i<=allRows.size();i++)
		{
			for(int j=1;j<=allColumns.size();j++)
			{
				//driver.findElement(By.xpath(s1+i+s2+j+s3)).getText();
				System.out.println(driver.findElement(By.xpath(s1+i+s2+j+s3)).getText());
			}
			System.out.println();
		}
		
		//Browser Navigations Commands
		
		/*driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();*/
		
		//To check whether element exist or not
		
		Boolean isElement=driver.findElements(By.xpath("asdasd")).size()!=0;
		System.out.println(isElement);
		
		//How to capture screenshot
		/*File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:\\scr.jpg"));
				*/
		 
	}

}
