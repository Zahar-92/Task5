package Task6;
import java.util.Random;

public class FactoryHead implements Make{
    private final byte TRI = 3;

    Head[] heads = new Head[TRI];
    @Override
    public String makeParts() {
        heads = Head.values();
        Random random = new Random();
        String name = String.valueOf((heads[random.nextInt(heads.length)]));
        return name;
    }
}