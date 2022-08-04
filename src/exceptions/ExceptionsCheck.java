package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {


    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek użytkownika?");
        int wiek = scanner.nextInt();
        if (wiek < 0) {
            throw new InvalidAgeException("number is below 0");

        }
        if (wiek>18) {
            System.out.println("kupuj flaszke");
        } else {
            System.out.println("nie kupisz flachy");
        }
    }
}
