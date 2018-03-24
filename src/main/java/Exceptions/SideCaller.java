package Exceptions;

public class SideCaller {

    public void getResult(String value) throws TriangleException {
        TriangleDivision triangle = new TriangleDivision();
        try {
            double side = Double.parseDouble(value);
            triangle.setSide(0);
        } catch (NumberFormatException e) {
            throw new TriangleException("Incorrect string value!", e);
        } catch (TriangleException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
