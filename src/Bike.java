public class Bike implements  Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jade rowerem z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuje rowerem!");

    }

    @Override
    public String info() {
        return "bike";
    }
    public void zatankuj() {
        System.out.println("aby miec duzo sily musze zjesc obiad");
    }
}
