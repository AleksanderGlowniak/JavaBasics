package Drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("otwieramy przegladarke za pomoca firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("znajdujemy element za pomoca firefox");
    }
}
