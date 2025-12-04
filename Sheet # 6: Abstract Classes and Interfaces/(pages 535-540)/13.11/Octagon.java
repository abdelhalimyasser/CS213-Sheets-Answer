public class Octagon extends GeometricObject implements Cloneable {
    private double side;

    public Octagon() {
        this.side = 0;
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (2 + 4 * Math.sqrt(2)) * side * side / 2;
    }

    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return super.compareTo(o);
    }

    @Override
    public Object clone() {
        return new Octagon(this.side);
    }

    @Override
    public String toString() {
        return "Octagon with side " + side + ", area " + getArea() + ", perimeter " + getPerimeter();
    }
}
