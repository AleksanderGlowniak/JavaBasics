import java.util.Scanner;

public class Homework1 {

    // napisz program który poprosi użytkownika o 2 liczby, a następnie wykona na nich podstawowe operacje matematyczne
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza cyfre: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę, podaj drugą cyfre: ");
        int secondNumber = scanner.nextInt();

        int addiction = firstNumber + secondNumber;
        System.out.println("Wynik dodawania: " + addiction);
        int subtraction = firstNumber - secondNumber;
        System.out.println("Wynik odejmowania: " + subtraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println("Wynik mnozenia: " + multiplication);
        int division = firstNumber / secondNumber;
        System.out.println("Wynik dzielenia: " + division);
        int mod = firstNumber % secondNumber;
        System.out.println("Modulo: " + mod);
    }
}
