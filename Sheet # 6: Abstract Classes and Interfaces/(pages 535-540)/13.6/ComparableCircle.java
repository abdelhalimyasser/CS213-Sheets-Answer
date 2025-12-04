public class ComparableCircle extends Circle {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject object) {
        if (object instanceof Circle) {
            Circle other = (Circle) object;
            return Double.compare(this.getArea(), other.getArea());
        }
        
        return Double.compare(this.getArea(), object.getArea());
    }

    @Override
    public String toString() {
        return "ComparableCircle with radius " + this.getRadius() + " and area " + this.getArea();
    }
}
