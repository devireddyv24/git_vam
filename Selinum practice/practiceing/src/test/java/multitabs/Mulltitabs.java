package multitabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mulltitabs {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Robot r=new Robot();
         r.keyPress(KeyEvent.VK_CONTROL);
         r.keyPress(KeyEvent.VK_T);
         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_T);
         r.keyPress(KeyEvent.VK_CONTROL);
         r.keyPress(KeyEvent.VK_T);
         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_T);
         String s=driver.getWindowHandle();
     Set<String> all=driver.getWindowHandles();
     ArrayList<String> all1=new ArrayList<>(all);
     System.out.println(s);
     System.out.println(all1);
     driver.switchTo().window(all1.get(1));
     driver.get("https://www.facebook.com/");
     driver.switchTo().window(all1.get(0));
     Thread.sleep(3000);
     driver.close();
   
	}

}
