package strategypatternexamplehomework;

public class Cat implements Animal {

    private final Animal walkingBehavior = new WalkingBehavior();

    @Override
    public void move() {
        walkingBehavior.move();
    }

}
