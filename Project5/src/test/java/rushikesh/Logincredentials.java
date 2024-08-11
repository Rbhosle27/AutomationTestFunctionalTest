package rushikesh;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Logincredentials {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
    WebDriver d = new EdgeDriver();
    d.manage().window().maximize();
    d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    d.get("https://demo.dealsdray.com");
   
    d.findElement(By.id("mui-1")).sendKeys("prexo.mis@dealsdray.com");
    d.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
  
    d.findElement(By.xpath("//button[text()='Login']")).click(); 
    d.findElement(By.xpath("//*[contains(text(),'chevron_right')]")).click();
    d.findElement(By.xpath("//span[text()='Orders']")).click();
    d.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
    d.findElement(By.cssSelector("div.MuiOutlinedInput-root input[type='file']")).sendKeys("C:\\demo-data.xlsx");
   	d.findElement(By.xpath("//*[contains(text(),'Import')]")).click();
   	d.findElement(By.xpath("//button[text()='Validate Data']")).click();
   	Thread.sleep(5000);
   	Alert alert=d.switchTo().alert();
   	System.out.println(alert.getText());
   	alert.accept();

	}
    
}