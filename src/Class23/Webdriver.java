package Class23;

public interface Webdriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(),
     closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that implements WebDriver
     interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();


}
class ChromeDriver implements Webdriver{

    @Override
    public void openBrowser() {
        System.out.println("Chrome opens browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome closes browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome maximises windows");
    }

    @Override
    public void findElement() {
        System.out.println("Chrome finds element");
    }
}
class FirefoxDriver implements Webdriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox opens browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox  closes browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox maximises windows");
    }

    @Override
    public void findElement() {
        System.out.println("Firefox finds element");
    }
}
