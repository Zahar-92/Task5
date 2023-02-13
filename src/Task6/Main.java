package Task6;

public class Main {
   private static FactoryRobots factoryRobots = new FactoryRobots();
    public static void main(String[] args) {

        System.out.println("Наша фабрика производит следующие модели роботов:");
    factoryRobots.makeRobot();

    }
}
