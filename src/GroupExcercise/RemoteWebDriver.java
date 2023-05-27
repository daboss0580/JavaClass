package GroupExcercise;




public interface RemoteWebDriver extends WebDriver{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver {

    @Override
    public void navigate() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void navigate() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void navigate() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}

class WebDriverTester{
    public static void main(String[] args) {
        ChromeDriver chrome=new ChromeDriver();
        FirefoxDriver firefox=new FirefoxDriver();
        SafariDriver safari=new SafariDriver();
        chrome.open();
        chrome.getTitle();
        chrome.navigate();
        chrome.close();
        firefox.open();
        firefox.getTitle();
        firefox.navigate();
        firefox.close();
        safari.open();
        safari.getTitle();
        safari.navigate();
        safari.close();
    }
}