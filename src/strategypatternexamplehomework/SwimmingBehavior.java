package strategypatternexamplehomework;

public class SwimmingBehavior implements Animal {

    @Override
    public void move() {
        System.out.println("The animal is swimming");
    }
}
