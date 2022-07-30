public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("jestem w konstruktorze mathteacher");
        this.school = school;
    }

    public void walk(){

        System.out.println("i walk very fast");
    }

    public void teachMath(){

        System.out.println("I'm teaching Math");
    }

    public void sayHello(){
        System.out.println("Hello my name is "+name);
        System.out.println("I'm "+ age);
    }
}
