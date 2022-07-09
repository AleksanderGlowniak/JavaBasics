public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        System.out.println("Wynik dodawania to: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        System.out.println("Wynik odejmowania to: " + (firstNumber - secondNumber));
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        System.out.println("Wynik mnozenia to: " + (firstNumber * secondNumber));
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        System.out.println("Wynik dzielenia to: " + (firstNumber / secondNumber));
        return firstNumber / secondNumber;
    }

    public int mod(int firstNumber, int secondNumber) {
        System.out.println("Modulo to: " + (firstNumber % secondNumber));
        return firstNumber % secondNumber;
    }
}
