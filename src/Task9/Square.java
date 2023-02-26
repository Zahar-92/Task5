package Task9;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws PerimeterException {
        if (side <= 0) {
        throw new PerimeterException("Side не корректно задана");
        }
        this.side = side;
    }
}