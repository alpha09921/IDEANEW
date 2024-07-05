public class Romaalpha {
   @Test
    public void zela() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://macrosvit.com.ua/zelenskiy-vladimir-aleksandrovich/themes-718/");
          }
}
