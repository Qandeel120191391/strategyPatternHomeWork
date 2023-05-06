package strategypatternexamplehomework;

public class StrategyPatternExampleHomeWork {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.move();
        /*print the animal is waking*/

        Animal snake = new Snake();
        snake.move();
        /*print the animal is crawling*/

        Animal fish = new Fish();
        fish.move();
        /*print the animal is swimming*/
    }

}
