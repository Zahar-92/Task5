package Task9;

public class PerimeterSquare {
    public void getPerimeter(String str) throws PerimeterException {
        Square square = new Square();

        try {
            double side = Double.parseDouble(str);
            square.setSide(0);
        } catch (NumberFormatException e){
            throw new PerimeterException("String не корректна", e);
        } catch (PerimeterException e) {
            System.err.println(e.getMessage());
        }
    }
}
