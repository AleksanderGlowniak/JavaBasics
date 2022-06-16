// umożliwia cykliczne wykonywanie ciągu instrukcji określoną liczbę razy
public class For {

    public static void main(String[] args) {

        int number = 100;
        // specjalna zmienna sterująca
        for (int i=0; i < number; i=i+2) {
            System.out.println(i);
        }
        // specjalna zmienna sterująca
        for (int i=0; i < number; i++) {
            if(i%5==0)
            System.out.println(i);
        }
    }
}
