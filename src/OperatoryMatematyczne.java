// operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych

public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addiction = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; //24
        float division = thirdNumber/secondNumber; // 0,66
        int mod = secondNumber%firstNumber; // ile razy 4 mieści się w 6 -> 1, 2
        // reszta z dzielenia - 2

        System.out.println("Wynik dodawania " + addiction);
        System.out.println("Wynik odejmowania " + subtraction);
        System.out.println("Wynik mnożenia " + multiplication);
        System.out.println("wynik dzielenia " + division);
        System.out.println("reszta z dzielenia " + mod);

/*        // inny zapis działań - poprzez nadpisywanie
        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po dodadniu " + firstNumber); // 10
        firstNumber-=secondNumber; // firstNumber - secondNumber
        System.out.println("po odejmowaniu " + firstNumber); // 4
        firstNumber*=secondNumber; // firstNumber * secondNumber
        System.out.println("Po mnożeniu " + firstNumber); // 24
        firstNumber/=secondNumber; // firstNumber/secondNumber
        System.out.println("Po dzieleniu " + firstNumber); // 4
        firstNumber%=secondNumber; // firstNumber % secondNumber
        System.out.println("Po modulo " + firstNumber); // 4*/
    }
}
