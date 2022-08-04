package listy;

import docs.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Olek");
        names.add("Aga");
        names.add("Zu");
        names.add("Olek");

/*        System.out.println(names.get(2)); // zwraca trzecia wartosc listy


        System.out.println(names.indexOf("Olek")); // zwraca numer indeksu
        System.out.println(names.lastIndexOf("Olek"));
        System.out.println(names.contains("Aga"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(4));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument());*/

       /* for (int i=0; i< names.size(); i++){
            System.out.println(names.get(i));
        }*/
        for (String cokolwiek : names){
            System.out.println(cokolwiek);
        }
    }
}
