public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "polibuda");

        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();


        Footballer footballer = new Footballer("mike", 20, "cidroki");

        footballer.playFootball();
        footballer.walk();
        footballer.eat();

    }
}
