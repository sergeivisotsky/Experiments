package Exceptions;

public class TriangleDivision {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws TriangleException {
        this.side = side;

        if (side <= 0) {
            throw new TriangleException("Incorrect side value!");
        }
    }
}
