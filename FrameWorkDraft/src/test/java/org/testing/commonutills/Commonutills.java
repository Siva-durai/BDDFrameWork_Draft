package org.testing.commonutills;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonutills {
	public static WebDriver driver;
	 public static Properties properties;
	
	
		 
	 private static final Logger log = LogManager.getLogger(Commonutills.class);
    
	
	 

/*
	public static void Readproperties(String file) throws IOException  {
	
		FileReader reader= new FileReader("Config.properties");			
		Properties p= new Properties();
		p.load(reader);
		
		
		
	}*/

	
	
	 

	 
	 
		public static void chromeBrowser() {
			System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Siva\\eclipse-workspace\\FrameWorkDraft\\src\\test\\resources\\Drivers\\chromedriver.exe");
			// WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
		    log.info(" Chrome Browser Lanuched");
		    
		}
			
		
		public static void lanuchchromebrowser() throws IOException {
				//System.setProperty("webdriver.chrome.driver",
						//	"C:\\Users\\Siva\\eclipse-workspace\\BddFrameWork\\src\\test\\resources\\Drivers\\chromedriver.exe");
					WebDriverManager.chromedriver().setup();
					 driver = new ChromeDriver();
						
						}
		
		public static void lanuchedgebrowser() {
	
				WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
				 driver.manage().window().maximize();
				 
				
	}
	
//URLlanuchs			
		public static void URLLanuch(String URL) {
			driver.manage().window().maximize();
			driver.get(URL);
			
		}
	 
	// click
	public static void Click(WebElement Element) {
		Element.click();
		
	}
	
//sendkeys	
	public static void Sendkeys(WebElement Element,String value) {
		Element.sendKeys(value);
		
	}
	

	
//ScreenShotString name
	public static void ScreenShot(String Name) throws IOException {
		TakesScreenshot Ts= (TakesScreenshot) driver;
		File scr=Ts.getScreenshotAs(OutputType.FILE);	
		File File= new File("C:\\Users\\Siva\\eclipse-workspace\\FrameWorkDraft\\src\\test\\resources\\ScreenShots\\"+Name+".png");
		FileHandler.copy(scr, File);
		
	}
	
	//sceanrio ScreenShot
		public  void ScenrioScreenShot(Scenario Sc) throws IOException {
			/*String sceanrioname=null;
			sceanrioname=Name.getName();
			
			TakesScreenshot Ts= (TakesScreenshot) driver;
			File scr=Ts.getScreenshotAs(OutputType.FILE);	
			File File= new File("C:\\Users\\Siva\\eclipse-workspace\\BddFrameWork\\src\\test\\resources\\ScreenShots\\"+sceanrioname+".png");
			FileHandler.copy(scr, File);*/
	 
			TakesScreenshot Ts= (TakesScreenshot) driver;
			byte[] bt=Ts.getScreenshotAs(OutputType.BYTES);
			//Sc.embed(bt,"");
		
			
			
			
			
		}
		
	
	
//Implicitly wait
	
	public static void implicit(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
//Dynamic wait for Element(Explicity wait)
	public static void waitForWebElement(WebElement Element) {
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(Element));
		
		
	}
	
	
//Navigate	
	public static void navigateto(String Url) {
		driver.navigate().to(Url);
		
	}
	
	// Refresh	
	
	public static void Refresh() {
		driver.navigate().refresh();

}
	
	
/*
* Frames
*/
	
	
	public static void frameById(String id) {
		driver.switchTo().frame(id);
		
	}	
	
	
	public static void frameByindex(int f) {
		driver.switchTo().frame(f);
		
	}	
	
	
	public static void frameByElement(WebElement element) {
		driver.switchTo().frame(element);
		
	}	
	
	public static void frameout() {
		driver.switchTo().defaultContent();
		
	}
	
	public static void Parent() {
		driver.switchTo().parentFrame();
		
	}
	
	
	/*
	 * Alert
	 */	
	public static void AlertAccept() {
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}
	
	public static void AlertReject() {
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
	}

	
	
	/*
	 * JavaScript executor
	 */	
	
	public static void jsclick(WebElement Element) {
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Element);
			
		
	}
	
public static void jssendkeys(WebElement Element,String elemantname) {
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value'"+elemantname+"',)", Element);
			
		
	}
	

public static void ScrollDown(WebElement Element) {
	
	JavascriptExecutor js=  (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", Element);
		
	
}
public static void ScrollUp(WebElement Element) {
	
	JavascriptExecutor js=  (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", Element);
		
	
}

/*
* Select
*/	

public static String getOptions(WebElement element) {
	Select s= new Select(element);
  List<WebElement>	slectedoptions=s.getOptions();
  String text=null;
 for (WebElement options : slectedoptions) {
	  text=options.getText();
	
}
 return text;
	
}


public static void dropdown(WebElement d,int index) {
	Select sel= new Select(d); 
	sel.selectByIndex(index);	
}
public void dropdown(WebElement d,String s,boolean byVisibleText) {
	Select sel1=new Select (d);
	if(byVisibleText) {
		sel1.selectByVisibleText(s);
	}else {
		sel1.selectByValue(s);
		}	
}

/*
* Actions
*/	
	


public static void doubleClick(WebElement element) {
	Actions act= new Actions(driver);
			act.doubleClick(element).perform();
}

public static void draganddrop(WebElement scr,WebElement des) {
	Actions act= new Actions(driver);
	act.dragAndDrop(scr, des);
}

public void attribute(WebElement a) {
	//WebElement a=driver.findElement(By.xpath("//*[@onfocus='disable_ctrlV()'][1]"));
	String x= a.getAttribute("value");
	System.out.println("Your Order id is : " + x);	
	log.info("Your Order id is : " + x);
}

public static void Quit() {
	driver.quit();
	
}

public static void close() {
	driver.close();
	
}




}
