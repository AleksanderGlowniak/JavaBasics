import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj pierwsza cyfre: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą cyfre: ");
        int secondNumber = scanner.nextInt();

        Calculator metody = new Calculator();
        int result = metody.add(firstNumber, secondNumber);

        Calculator metody1 = new Calculator();
        float result1;
        result1 = metody1.division(firstNumber, secondNumber);

        Calculator metody2 = new Calculator();
        int result2 = metody2.multiplication(firstNumber, secondNumber);

        Calculator metody3 = new Calculator();
        int result3 = metody3.subtraction(firstNumber, secondNumber);

        Calculator metody4 = new Calculator();
        int result4 = metody4.mod(firstNumber, secondNumber);

    }

}
