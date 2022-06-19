// Zadanie 1: Wypisz liczby z zakresu 1-100 podzielne przez 3
// Zadanie 2: Odwrócić elementy tablicy [1,3,5,7,0] -> [0,7,5,3,1]

//Zadanie 1:
public class Homework3 {

    public static void main(String[] args) {
/*        int number = 100;
        for (int i=0; i < number; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }*/
        //Zadanie 2:
        int[] Numbers = new int[] {1,3,5,7,0};
        for (int i=0; i<(Numbers.length/2); i++) {
            int temp = Numbers[i]; // dla i równe 0 wartość tablicy jest 1
            Numbers[i] = Numbers[Numbers.length-1-i]; // 4 --> 0
            Numbers[Numbers.length-1-i] = temp;
            System.out.println("Iteracja numer " + i);

        }
        for (int i=0; i < Numbers.length; i++) {
            System.out.println(Numbers[i]);
        }
    }
}



