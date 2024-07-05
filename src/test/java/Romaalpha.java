public class Romaalpha {
   @Test
    public void zela() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://macrosvit.com.ua/zelenskiy-vladimir-aleksandrovich/themes-718/");
          }


   
@Test
    public void logout(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://sota.store/ua/");
        WebElement loginLink = driver.findElement(By.linkText("Увійти"));
        loginLink.click();
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("gittest@gmail.com");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("ttete");
        WebElement loginlinks = driver.findElement(By.cssSelector("input[type='submit'][value='Увійти']"));
        loginlinks.click();
        WebElement contentLinks = driver.findElement(By.xpath("//div[text()='Особистий кабінет']"));
        assertTrue(contentLinks.isDisplayed(),"Юзер увійшов в особистий кабінет");

    }
   
}
