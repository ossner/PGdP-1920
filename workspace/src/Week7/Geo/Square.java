package Week7.Geo;
public class Square extends BaseArea {
    private double length;

    public double getLength() {
        return length;
    }

    @Override
    public double circumference() {
        return 4 * length;
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public boolean isSquare() {
        return true;
    }

    @Override
    public Square toSquare() {
        return this;
    }

    public Square(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Quadrat{" + "laenge=" + length + "; " + super.toString() + '}';
    }
}
