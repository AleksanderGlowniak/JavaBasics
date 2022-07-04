// Stwórz 3 obiekty klasy student. Przypisz wartości do pól. Stwórz tablice i dodaj studentów do tablicy.
// Przejdz przez studentów w tablicy i wywołaj wszystkie 4 metody.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.imie = "Olek";
        student1.nazwisko = "X";
        student1.numerIndeksu = 1;
        student1.email = "olek@gmail.com";
        student1.nick = "olek123";

        Student student2 = new Student();
        student2.imie = "Kamil";
        student2.nazwisko = "Y";
        student2.numerIndeksu = 2;
        student2.email = "kamil@gmail.com";
        student2.nick = "kamil123";

        Student student3 = new Student();
        student3.imie = "Przemek";
        student3.nazwisko = "Z";
        student3.numerIndeksu = 3;
        student3.email = "przemek@gmail.com";
        student3.nick = "przemek123";

        Student[] studenci = new Student[3];

        studenci[0] = student1;
        studenci[1] = student2;
        studenci[2] = student3;

        for (int i = 0; i < studenci.length; i++) {

            studenci[i].przedstawSie();
            studenci[i].podajEmail();
            studenci[i].podajNrIndeksu();
            studenci[i].zalogujSie();
        }
    }

}
