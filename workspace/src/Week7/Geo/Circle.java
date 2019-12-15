package Week7.Geo;
public class Circle extends BaseArea {
    private double radius;

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Kreis{" + "radius=" + radius + "; " + super.toString() + '}';
    }

}
