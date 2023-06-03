package Class23;

public class WebdriverTester {
    public static void main(String[] args) {
        Webdriver[] webdriver= {new ChromeDriver(),new FirefoxDriver()};
        for (Webdriver drivers:webdriver){
            drivers.closeBrowser();
        }

    }
}
