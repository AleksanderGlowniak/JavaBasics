public class InstrkucjaWarunkowaElseIf {

    public static void main(String[] args) {
        int number = -2;

        if (number == 0) {
            System.out.println("Liczba rowna zero");
        } else if (number > 0) {
            System.out.println("Liczba dodatnia");
        } else if (number < -5) {
            System.out.println("liczba mniejsza od -5");
        } else {
            System.out.println("liczba w przedziale od 0 do -5");
        }
    }
}
