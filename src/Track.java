public class Track implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("jade ciezarowka z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuje fest");
    }

    @Override
    public String info() {
        return "ciezarowka";
    }
}
