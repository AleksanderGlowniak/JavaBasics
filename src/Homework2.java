// 1. Zapytaj użytkownika o wiek.
// 2. W przypaddku gdy ma mniej niż 18 lat wypisz na ekranie informacje ze nie może kupic alkoholu.
// 3. Gdy ma wiecej niz 18 lat to podziekuj za zakupy.

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek użytkownika:");
        int wiek = scanner.nextInt();
        if (wiek < 18 && wiek > 0) {
            System.out.println("Nie możesz kupić alkoholu!!");
        } else if (wiek < 0) {
            System.out.println("Niepoprawny wiek");
        } else {
            System.out.println("Dziekuje za zakupy!");
        }
    }
}
