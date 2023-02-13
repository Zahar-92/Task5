package Task6;

public class FactoryRobots {
    FactoryBody factoryBody = new FactoryBody();
    FactoryHead factoryHead = new FactoryHead();
    private final String[] ROBOTNAMES = new String[]{"R2-D2", "Боевой дроид B1", "МагнаСтраж IG-100", "EV-9D9",
            "2-1B", "Протокольный дроид C-3PO", " Дроид-убийца", "T3-M4", "Дарт Вейдер"};
    private String[] robots = new String[9];

    public void makeRobot() {
        for (int i = 0; i < 9; i++) {
            String head = factoryHead.makeParts();
            String body = factoryBody.makeParts();
            robots[i] = "Модель робота: " + ROBOTNAMES[i] + "Название головы: " + head + "Название тела: " + body;
        }
        print();
    }

    private void print() {
        for (int i = 0; i < robots.length; i++) {
            System.out.println(robots[i] + "\n");
        }
    }
}
