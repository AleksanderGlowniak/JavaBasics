public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        //inkrementacja zwiększenie wartości o jeden

        int a = 0;
        System.out.println("Wartość a: " + a); // 0
        int b = ++a; // preinkrementacja
        System.out.println("Wartość b: " + b); // 1
        System.out.println("wartość a: " + a); // 1
        int c = a++; // postinkrementacja
        System.out.println("Wartość c: " + c); // 1
        System.out.println("Wartość a: " + a); // 2

        //dekrementacja to zmniejszanie wartości o jeden
        int d = 0;
        System.out.println("Wartość d: " + d); // 0
        int e = d--; // postdekrementacja
        System.out.println("Wartość e: " + e); // 0
        System.out.println("Wartość d: " + d); // -1
        int f = --d; //predekrementacja
        System.out.println("Wartość f: " + f); //-2
        System.out.println("Wartość d: " + d); //-2
    }
}
