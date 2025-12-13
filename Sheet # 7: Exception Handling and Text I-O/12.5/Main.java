import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    try{
	        Triangle t1 = new Triangle(1, 2, 3);
	    } catch (IllegalTriangleException ex){
	        System.out.println("Error: " + ex.getMessage());
	    }
	}
}
