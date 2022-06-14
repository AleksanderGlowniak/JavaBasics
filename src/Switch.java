// instrukcja sterująca switch

public class Switch {
    public static void main(String[] args) {
        String jedzenie = "pizza";

        switch (jedzenie) {
            case "pizza":
                System.out.println("Cena: 25 zł");
                break;
            case "hamburger":
                System.out.println("Cena: 18 zł");
                break;
            case "schabowy":
                System.out.println("Cena: 5 zł");
                break;
            default:
                System.out.println("Nie mamy takiego dania");
        }

    }
}
