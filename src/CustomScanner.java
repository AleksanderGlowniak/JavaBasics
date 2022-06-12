import java.util.Scanner;

public class CustomScanner {

/*    // podawanie imienia
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");
    }*/
    //podawanie liczby
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("kwadrat tej liczby to: " + result);
    }
}
