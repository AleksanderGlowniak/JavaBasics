public class AutoTest {

    public static void main(String[] args) {

        Auto fiat = new Auto("Fiat", "Tipo", 2017, 60000);


        fiat.jedz();
        fiat.hamuj();
        fiat.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model =  "A5";
        audi.rokProdukcji = 2020;
        audi.przebieg = 0;

        audi.jedz();
        audi.hamuj();
        audi.info();
    }
}
