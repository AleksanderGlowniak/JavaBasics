import Drivers.FirefoxDriver;
import Drivers.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b; // konwersja neiwjawna i a zostaje prekonwertowana na double

        int d = a/(int) b; // jawnie przekonwertujemy z double na int

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();


    }
}
