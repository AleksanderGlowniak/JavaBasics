package animals;

public abstract class Animal {

    public final static int legs = 4;


    public abstract void sound();

    public void sayHello(){
        System.out.println("hello I'm an animal");
    }
}
