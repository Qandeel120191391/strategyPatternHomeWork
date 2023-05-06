package strategypatternexamplehomework;

public class Snake implements Animal {

    private final Animal crawlingBehavior = new CrawlingBehavior();

    @Override
    public void move() {
        crawlingBehavior.move();
    }
}
