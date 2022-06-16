public class InkrementacjaZadanie {

    public static void main(String[] args) {

        int a, b=13, c;

        a = ++b * 2; // zmienna b rośnie z 13 do 14 -> 14*2 = a
        c = a++ + b; // a=28 + 14 = 42, po wszystkim  a  rośnie do 29
        b = ++a + a-- - c++ - --c; // cos tu nie gra....
        System.out.println("a="+a+", b="+b+", c="+c);
    }
}
