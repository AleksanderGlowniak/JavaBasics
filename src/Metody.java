// blok ktory zawiera jakiejs instrukcje
// moze byc uruchomiona (wywolana) poprzez odwolanie sie do jeje nazwy ()

public class Metody {

    public void policzWynik(){
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i<100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to : " + result);
    }

    public int pobierzWynik(){
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i<100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to : " + result);
        return result;
    }

    public void sum() {
        int firstNumber = 0;
        int seondNumber = 2;
        System.out.println("Suma to : " + firstNumber+seondNumber);
    }

    public String imie() {
        System.out.println("Nazywam sie Tomek");
        return "Tomek";
    }
    public int policzWynikParam(int number){
        System.out.println("Number ma wartosc: " + number);
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i<number; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to : " + result);
        return result;
    }

    public int add(int firstNumber, int secondNumber) {
        System.out.println("Suma to: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }
}
