package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // klasa potomna w innej paczce nie ma dostepu do pol/metod private oraz default czyli bez identyfikatora
    // w zwiazku z brakiem dziedziczenia nie ma dostepu rowniez do protected

    public void testIdentifier(){
        Parent parent = new Parent();
        System.out.println(parent.first);

        parent.firstMethod();

    }
}
