public class Main {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(3);

        System.out.println("Larger ComparableCircle: " + (c1.compareTo(c2) >= 0 ? c1 : c2));

        Rectangle r1 = new Rectangle(4, 5);
        Circle c3 = new Circle(6);

        System.out.println("Larger between circle and rectangle: " + GeometricObject.max(c3, r1));
    }
}
