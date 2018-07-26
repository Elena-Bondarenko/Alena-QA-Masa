import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGooglePageTest {
ChromeDriver driver;

@BeforeMethod

    public void setUp(){
    driver = new ChromeDriver();

}
@Test
    public void testOpeningGooglePage(){
//driver.get("https://www.google.co.il/");
    driver.navigate().to("https://www.google.co.il/");

    driver.findElement(By.name("q")).sendKeys("Israel");
}
@Test
public void testOpeningTrelloPage(){
    driver.navigate().to("https://trello.com/");
//    driver.findElement(By.linkText("Log in.")).click();
driver.findElement(By.xpath("//*[@href='/login']")).click();
}





@AfterClass
    public void tearDown() throws InterruptedException {
    Thread.sleep(4000);
    driver.quit();
}
}
