// instrukcje warunkowe pozwalaja nam określac ktore czesci kodu maja zostac wykonane gdy zostanie spelniony jakis warunek

public class InstrkucjaWarunkowaIfElse {
    public static void main(String[] args) {
        float a = 10.0F;
        float b = 2.233F;
        if(b != 0) {
            System.out.println("Wynik dzielenia to: " + (a/b));
        } else {
        System.out.println("Proszę podaj inną liczbę: ");
        }
    }
}
