package Task6;
import java.util.Random;
public class FactoryBody implements Make{
    private final byte TRI = 3;

    Body[] bodies = new Body[TRI];

    @Override
    public String makeParts() {
        bodies = Body.values();
        Random random = new Random();
        String name = String.valueOf((bodies[random.nextInt(bodies.length)].name()));
        return name;

    }
}