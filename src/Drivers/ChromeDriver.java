package Drivers;

public class ChromeDriver implements WebDriver {


    @Override
    public void get() {
        System.out.println("otwieramy przegladarke za pomoca Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("znajdujemy element za pomoca Chrome");
    }
}
