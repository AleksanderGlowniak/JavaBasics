public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Tom";
        teacher.age =  29;
        teacher.school = "Polibuda";
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();


        Footballer footballer = new Footballer();
        footballer.name = "Mike";
        footballer.age = 20;
        footballer.footballClub = "cidroki";
        footballer.playFootball();
        footballer.walk();
        footballer.eat();

    }
}
