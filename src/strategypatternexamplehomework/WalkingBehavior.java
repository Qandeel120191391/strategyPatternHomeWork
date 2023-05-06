package strategypatternexamplehomework;

public class WalkingBehavior implements Animal {

    @Override
    public void move() {
        System.out.println("The animal is walking");
    }
}
