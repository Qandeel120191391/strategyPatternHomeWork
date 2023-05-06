package strategypatternexamplehomework;

public class Fish implements Animal {

    private final Animal swimmingBehavior = new SwimmingBehavior();

    @Override
    public void move() {
        swimmingBehavior.move();
    }

}
