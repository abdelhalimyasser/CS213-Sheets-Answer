public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(6);

        System.out.println("Comparing c1 and c2 by radius: " + (c1.compareTo(c2) >= 0 ? c1 : c2));
        System.out.println("Larger circle by area (c1 vs c3): " + GeometricObject.max(c1, c3));
    }
}
